package com.xyj.xyjconsumer.controller;

import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjconsumer.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private OrderFeign orderFeign;

    //用户查询自己购物车的信息
    @GetMapping("/{uid}")
    public Result findMyCart(@PathVariable("uid") Long uid){
        return orderFeign.findMyCart(uid);
    };

    //删除购物车中的菜品
    @DeleteMapping("/{id}")
    public Result deleteCartMenu(@PathVariable("id") Long id){
        return orderFeign.deleteCartMenu(id);
    };

    //增加购物车中菜品的数量
    @PutMapping("/add/{id}")
    public Result addMenu(@PathVariable("id") Long id){
        return orderFeign.addMenu(id);
    };

    //减少购物车中菜品的数量
    @PutMapping("/sub/{id}")
    public Result subMenu(@PathVariable("id") Long id){
        return orderFeign.subMenu(id);
    };

    @PostMapping("/addCart")
    public Result addCart(Cart cart){
        return orderFeign.addCart(cart);
    };

    //查询购物车菜品总价
    @GetMapping("/getSumPrice/{uid}")
    public Result getSumPrice(@PathVariable("uid") Long uid){
        return orderFeign.getSumPrice(uid);
    }
}
