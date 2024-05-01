package com.test.order.app.controller;

import com.test.order.app.entity.Order;
import com.test.order.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order){
        return  orderService.saveOrder(order);
    }
}
