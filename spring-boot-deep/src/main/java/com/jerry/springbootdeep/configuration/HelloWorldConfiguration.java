package com.jerry.springbootdeep.configuration;

import com.jerry.springbootdeep.annotation.ConditionalOnSystem;
import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {
    @Bean
    @ConditionalOnSystem(system = "linux")
    SayHelloWorld sayHolloWorld() {
        System.out.println("=================>加载 helloworld,条件注解linux ");
        return new SayHelloWorld();
    }


}
