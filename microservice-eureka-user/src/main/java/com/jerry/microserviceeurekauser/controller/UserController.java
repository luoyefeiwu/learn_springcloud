package com.jerry.microserviceeurekauser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrdersByUser/{id}")
    public String findOrdersByUser(@PathVariable String id) {
        //假设用户只有一个订单，并且订单id为123
        int oid = 123;
        return restTemplate.getForObject("http://microservice-eureka-order/order/" + oid, String.class);
    }
}
