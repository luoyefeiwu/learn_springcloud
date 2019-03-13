package com.jerry.microservicespringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class MicroserviceSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringcloudApplication.class, args);
    }

}
