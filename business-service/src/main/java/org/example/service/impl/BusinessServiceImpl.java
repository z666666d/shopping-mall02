package org.example.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Order;
import org.example.service.AccountService;
import org.example.service.BusinessService;
import org.example.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class BusinessServiceImpl implements BusinessService {


    @Resource
    private OrderService orderService;

    @Resource
    private AccountService accountService;


    /**
     * 创建订单->调用订单服务创建订单->调用账户服务增加积分
     *
     * @param order
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void order(Order order) {
        //1、新建订单
        log.info("------>开始新建订单");
        //2、创建订单
        log.info("------>开始调用订单微服务，做订单创建start");
        orderService.create(order);
        log.info("------>开始调用订单微服务，做订单创建end");
        //3、增加积分
        // 根据订单金额计算增加积分数量
        int point = order.getMoney().intValue();
        log.info("------>开始调用账户微服务，做积分增加start");
        accountService.increase(order.getUserId(), point);
        log.info("------>开始调用账户微服务，做积分增加end");

        log.info("------>下订单结束了，O(∩_∩)O哈哈~");
    }
}