package com.jerry.springbootdeep.configuration;


import com.jerry.springbootdeep.annotation.ConditionalOnSystem;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Map<String, Object> attrs = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystem.class.getName());
        System.out.println("--------------->system?---------" + attrs.get("system"));
        return "linux".equalsIgnoreCase(attrs.get("system").toString());
    }
}
