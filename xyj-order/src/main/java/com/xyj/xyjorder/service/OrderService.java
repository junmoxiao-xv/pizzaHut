package com.xyj.xyjorder.service;

import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.Result;

public interface OrderService {
    //查询所有订单信息
    Result findAll();

    //用户查询自己的订单信息
    Result findMyOrder(Long uid);

    //确认已使用订单
    Result affirmUse(Long id);

    //下单
    Result addOrder(Order order);

    //取消订单
    Result cancelOrder(Long id);
}
