package com.xyj.xyjcommon.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {
    //签名
    private static final String SIGN = "token!Q2W#ESRW";

    //生成token
    public static String createToken(Map<String,String> map){
        //失效时间
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,1);

        //创建jwt builder
        JWTCreator.Builder builder = JWT.create();

        //payload
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });

        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(SIGN));

        return token;
    }

    //验证token
    public static DecodedJWT verifyToken(String token){
        return JWT.require(Algorithm.HMAC256(SIGN)).build().verify(token);
    }
}
