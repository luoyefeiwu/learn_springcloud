package com.jerry.springbootdeep.annotation;

import com.jerry.springbootdeep.configuration.HelloWorldConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import({HelloWorldConfiguration.class})
public @interface EnableHelloWorld {
}
