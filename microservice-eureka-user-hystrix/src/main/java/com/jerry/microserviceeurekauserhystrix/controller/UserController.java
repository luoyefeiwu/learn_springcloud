package com.jerry.microserviceeurekauserhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id) {
        return restTemplate.getForObject("http://microservice-eureka-order/order/" + id, String.class);
    }

    public String fallbackInfo(@PathVariable String id) {
        return "服务不可用，请稍后再试!";
    }
}
