package org.example.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.example.domain.Order;
public interface BusinessService {

    void order(Order order);
}
