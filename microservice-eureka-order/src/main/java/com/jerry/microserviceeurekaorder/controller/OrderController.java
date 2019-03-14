package com.jerry.microserviceeurekaorder.controller;

import com.jerry.microserviceeurekaorder.model.Order;
import com.jerry.microserviceeurekaorder.utils.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id) {
        Order order = new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("110");
        return order.toString()+"端口："+ServiceInfoUtil.getPort();
    }
}
