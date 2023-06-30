package com.xyj.xyjorder.controller;


import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public Result findAll(){
        return orderService.findAll();
    }

    @GetMapping("/{uid}")
    public Result findMyOrder(@PathVariable("uid") Long uid){
        return orderService.findMyOrder(uid);
    }

    @PutMapping("/{id}")
    public Result affirmUse(@PathVariable("id") Long id){
        return orderService.affirmUse(id);
    }


    @PostMapping("/")
    public Result addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @PutMapping("/cancel/{id}")
    public Result cancelOrder(@PathVariable("id") Long id){
        return orderService.cancelOrder(id);
    }
}
