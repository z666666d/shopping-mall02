package org.example.service;

import org.example.dao.OrderDao;
import org.example.domain.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    public void create(Order order){
        orderDao.create(order);
    }
}
