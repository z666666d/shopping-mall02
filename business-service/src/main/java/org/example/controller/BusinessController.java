package org.example.controller;

import org.example.domain.CommonResult;
import org.example.domain.Order;
import org.example.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/business/order")
    public CommonResult order(Order order) {
        businessService.order(order);

        return new CommonResult(200, "下单成功");
    }
}
