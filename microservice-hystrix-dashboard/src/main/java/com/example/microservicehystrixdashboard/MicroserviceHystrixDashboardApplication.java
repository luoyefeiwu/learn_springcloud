package com.example.microservicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHystrixDashboardApplication.class, args);
    }

}
