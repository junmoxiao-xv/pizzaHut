package com.xyj.xyjorder.service.impl;

import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.CartVO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjorder.mapper.CartMapper;
import com.xyj.xyjorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public Result findMyCart(Long uid) {
        List<CartVO> myCart = cartMapper.findMyCart(uid);
        if (myCart.size() == 0){
            return Result.notFound("购物车空空如也");
        }
        return Result.ok(myCart);
    }

    @Override
    public Result deleteCartMenu(Long id) {
        int count = cartMapper.deleteCartMenu(id);
        if (count != 1){
            return Result.Fail("删除失败");
        }
        return Result.ok("删除成功");
    }

    @Override
    public Result addMenu(Long id) {
        int count = cartMapper.addMenu(id);
        if (count != 1){
            return Result.Fail("添加数量失败");
        }
        return Result.ok("添加数量成功");
    }

    @Override
    public Result subMenu(Long id) {
        int count = cartMapper.subMenu(id);
        if (count != 1){
            return Result.Fail("减少数量失败");
        }
        return Result.ok("减少数量成功");
    }

    @Override
    public Result addCart(Cart cart) {
        int count = cartMapper.addCart(cart);
        if (count != 1){
            return Result.Fail("添加购物车失败");
        }
        return Result.ok("添加购物车成功");
    }

    @Override
    public Result getSumPrice(Long uid) {
        return Result.ok(cartMapper.getSumPrice(uid));
    }
}
