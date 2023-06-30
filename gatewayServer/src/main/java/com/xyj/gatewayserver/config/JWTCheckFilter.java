package com.xyj.gatewayserver.config;

import com.alibaba.nacos.common.utils.StringUtils;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.xyj.gatewayserver.constants.GatewayConstant;
import com.xyj.xyjcommon.utils.JWTUtils;
import com.xyj.xyjcommon.utils.JsonUtils;
import io.netty.util.internal.StringUtil;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JWTCheckFilter implements GlobalFilter, Ordered {
    //网关过滤器

    //2.是否是白名单(/oauth/token)
    //3.如果是白名单，放行;
    //如果不是白名单，我们需要获取token请求头中
    //Authorization : bearer token
    //4.如果传递了我们放行
    //5.如果没有传递，我们返回没有权限信息
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        HashMap<String,Object> map = new HashMap<>();
        //获取请求路径
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        if (!GatewayConstant.NOT_ALLOW_URLS.contains(path)){
            return chain.filter(exchange);
        }

        //获取请求头中的数据
        String header = request.getHeaders().getFirst("Authorization");
        System.out.println("=====================43============================"+header);

        if (StringUtils.isNotBlank(header)){
            //获取请求头中的token数据
            String token = header.replaceAll("bearer","");
            System.out.println("=======================48=========================="+token);
            //请求中有token数据
            if (StringUtils.isNotBlank(token)){
                try {
                    JWTUtils.verifyToken(token);
                    map.put("state",true);
                    map.put("msg","请求成功");
                    //放行
                    chain.filter(exchange);
                    return chain.filter(exchange);
                }catch (SignatureVerificationException e){
                    e.printStackTrace();
                    return handleErrorResponse(exchange, "签名无效");
                }catch (TokenExpiredException e){
                    e.printStackTrace();
                    return handleErrorResponse(exchange, "token过期");
                }catch (AlgorithmMismatchException e){
                    e.printStackTrace();
                    return handleErrorResponse(exchange, "token算法不一致");
                }catch (Exception e){
                    e.printStackTrace();
                    return handleErrorResponse(exchange, "token无效");
                }
            }else {
                System.out.println("====================71=============================请求头中没有token");
            }
        }

        return handleErrorResponse(exchange, "认证失败");
    }

    private Mono<Void> handleErrorResponse(ServerWebExchange exchange, String errorMessage) {
        // 构造错误响应体
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("state", false);
        errorResponse.put("msg", errorMessage);

        // 设置响应状态码和内容
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON);
        DataBuffer buffer = exchange.getResponse().bufferFactory().wrap(JsonUtils.toJson(errorResponse).getBytes());

        // 返回错误响应
        return exchange.getResponse().writeWith(Mono.just(buffer));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
