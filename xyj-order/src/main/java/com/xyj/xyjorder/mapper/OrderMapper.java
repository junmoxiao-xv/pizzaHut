package com.xyj.xyjorder.mapper;

import com.xyj.xyjcommon.entity.Order;
import com.xyj.xyjcommon.entity.OrderVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    //查询所有订单信息
    List<OrderVO> findAll();

    //用户查询自己的订单信息
    List<OrderVO> findMyOrder(Long uid);

    //确认已使用订单
    int affirmUse(Long id);

    //下单
    int addOrder(Order order);

    //取消订单
    int cancelOrder(Long id);
}
