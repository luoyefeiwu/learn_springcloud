package com.jerry.springbootdeep.configuration;


import com.jerry.springbootdeep.annotation.EnableHelloWorldSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class HelloWorldConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> attrs = annotationMetadata.getAnnotationAttributes(EnableHelloWorldSelector.class.getName());
        System.out.println("----------?model----" + attrs.get("model"));
        return new String[]{
                HelloWorldConfiguration.class.getName()
        };
    }
}
