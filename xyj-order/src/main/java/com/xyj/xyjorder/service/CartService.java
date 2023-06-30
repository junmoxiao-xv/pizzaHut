package com.xyj.xyjorder.service;


import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.Result;

public interface CartService {
    //用户查询自己购物车的信息
    Result findMyCart(Long uid);

    //删除购物车中的菜品
    Result deleteCartMenu(Long id);

    //增加购物车中菜品的数量
    Result addMenu(Long id);

    //减少购物车中菜品的数量
    Result subMenu(Long id);

    //将菜品添加到购物车
    Result addCart(Cart cart);


    //查询购物车菜品总价
    Result getSumPrice(Long uid);
}
