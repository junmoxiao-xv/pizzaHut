package com.xyj.xyjconsumer.controller;

import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjconsumer.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderFeign orderFeign;

    //查询所有订单信息
    @GetMapping("/")
    public Result findAll(){
        return orderFeign.findAll();
    };

    //用户查询自己的订单信息
    @GetMapping("/{uid}")
    public Result findMyOrder(@PathVariable("uid") Long uid){
        return orderFeign.findMyOrder(uid);
    };

    //确认已使用订单
    @PutMapping("/{id}")
    public Result affirmUse(@PathVariable("id") Long id){
        return orderFeign.affirmUse(id);
    };

    //下单
    @PostMapping("/")
    public Result addOrder(Order order){
        return orderFeign.addOrder(order);
    };

    //取消订单
    @PutMapping("/cancel/{id}")
    public Result cancelOrder(@PathVariable("id") Long id){
        return orderFeign.cancelOrder(id);
    };
}
