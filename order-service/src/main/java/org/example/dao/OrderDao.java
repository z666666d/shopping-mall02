package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.Order;

@Mapper
public interface OrderDao {
    //1、新建订单
    void create(Order order);

}
