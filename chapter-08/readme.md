# 消息总线

1. 下载rabbitmq
2.  添加依赖

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bus-amqp</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency> 

3. 刷新配置 post 请求

    http://localhost:8881/actuator/bus-refresh