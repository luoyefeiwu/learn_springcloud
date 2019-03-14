package com.jerry.microserviceeurekaorder.utils;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {

    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.event = webServerInitializedEvent;
    }

    /**获取端口
     * @return
     */
    public static int getPort() {
        return event.getWebServer().getPort();
    }
}
