package org.example.service;

import org.example.domain.CommonResult;
import org.example.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "order-service")
public interface OrderService {

    @PostMapping(value = "/order/create")
    CommonResult create(@RequestBody Order order);
}
