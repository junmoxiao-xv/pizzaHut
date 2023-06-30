package com.xyj.xyjconsumer.feign;

import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "xyj-order")
public interface OrderFeign {
    //查询所有订单信息
    @GetMapping("/order/")
    Result findAll();

    //用户查询自己的订单信息
    @GetMapping("/order/{uid}")
    Result findMyOrder(@PathVariable("uid") Long uid);

    //确认已使用订单
    @PutMapping("/order/{id}")
    Result affirmUse(@PathVariable("id") Long id);

    //下单
    @PostMapping("/order/")
    Result addOrder(@RequestBody Order order);

    //取消订单
    @PutMapping("/order/cancel/{id}")
    Result cancelOrder(@PathVariable("id") Long id);

    //用户查询自己购物车的信息
    @GetMapping("/cart/{uid}")
    Result findMyCart(@PathVariable("uid") Long uid);

    //删除购物车中的菜品
    @DeleteMapping("/cart/{id}")
    Result deleteCartMenu(@PathVariable("id") Long id);

    //增加购物车中菜品的数量
    @PutMapping("/cart/add/{id}")
    Result addMenu(@PathVariable("id") Long id);

    //减少购物车中菜品的数量
    @PutMapping("/cart/sub/{id}")
    Result subMenu(@PathVariable("id") Long id);

    @PostMapping("/cart/addCart")
    Result addCart(@RequestBody Cart cart);

    @GetMapping("/cart/getSumPrice/{uid}")
    Result getSumPrice(@PathVariable("uid") Long uid);
}
