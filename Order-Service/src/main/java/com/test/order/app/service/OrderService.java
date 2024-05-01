package com.test.order.app.service;

import com.test.order.app.entity.Order;
import com.test.order.app.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
