package com.xyj.xyjorder.service.impl;

import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.OrderVO;
import com.xyj.xyjcommon.entity.Result;
import com.xyj.xyjorder.mapper.OrderMapper;
import com.xyj.xyjorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Result findAll() {
        List<OrderVO> orders = orderMapper.findAll();
        if (orders.size() == 0){
            return Result.notFound("没有订单信息");
        }
        return Result.ok(orders);
    }

    @Override
    public Result findMyOrder(Long uid) {
        List<OrderVO> orders = orderMapper.findMyOrder(uid);
        if (orders.size() == 0){
            return Result.notFound("没有订单信息");
        }
        return Result.ok(orders);
    }

    @Override
    public Result affirmUse(Long id) {
        int count = orderMapper.affirmUse(id);
        if (count != 1){
            return Result.Fail("确认使用失败");
        }
        return Result.ok("确认使用成功");
    }

    @Override
    public Result addOrder(Order order) {
        int count = orderMapper.addOrder(order);
        if (count != 1){
            return Result.Fail("下单失败");
        }
        return Result.ok("下单成功");
    }

    @Override
    public Result cancelOrder(Long id) {
        int count = orderMapper.cancelOrder(id);
        if (count != 1){
            return Result.Fail("取消订单失败");
        }
        return Result.ok("取消订单成功");
    }
}
