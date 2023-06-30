package com.xyj.xyjorder.mapper;

import com.xyj.xyjcommon.entity.Cart;
import com.xyj.xyjcommon.entity.CartVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper {
    //用户查询自己购物车的信息
    List<CartVO> findMyCart(Long uid);

    //删除购物车中的菜品
    int deleteCartMenu(Long id);

    //增加购物车中菜品的数量
    int addMenu(Long id);

    //减少购物车中菜品数量
    int subMenu(Long id);

    //将菜品添加到购物车
    int addCart(Cart cart);

    //查询购物车菜品总价
    int getSumPrice(Long uid);
}
