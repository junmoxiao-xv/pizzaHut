package com.xyj.xyjorder.controller;

import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{uid}")
    public Result findMyCart(@PathVariable("uid") Long uid){
        return cartService.findMyCart(uid);
    }

    @DeleteMapping("/{id}")
    public Result deleteCartMenu(@PathVariable("id") Long id){
        return cartService.deleteCartMenu(id);
    }

    @PutMapping("/add/{id}")
    public Result addMenu(@PathVariable("id") Long id){
        return cartService.addMenu(id);
    }

    @PutMapping("/sub/{id}")
    public Result subMenu(@PathVariable("id") Long id){
        return cartService.subMenu(id);
    }

    @PostMapping("/addCart")
    public Result addCart(@RequestBody Cart cart){
        System.out.println(cart.toString());
        return cartService.addCart(cart);
    }

    @GetMapping("/getSumPrice/{uid}")
    public Result getSumPrice(@PathVariable("uid") Long uid){
        return cartService.getSumPrice(uid);
    }
}
