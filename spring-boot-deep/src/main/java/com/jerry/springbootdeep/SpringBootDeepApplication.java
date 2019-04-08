package com.jerry.springbootdeep;

import com.jerry.springbootdeep.annotation.EnableHelloWorld;
import com.jerry.springbootdeep.annotation.EnableHelloWorldSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
//@EnableHelloWorld
@EnableHelloWorldSelector(model = "second")

public class SpringBootDeepApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeepApplication.class, args);
    }

}
