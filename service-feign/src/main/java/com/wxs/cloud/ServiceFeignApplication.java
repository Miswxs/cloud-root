package com.wxs.cloud;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by xiaoshen.wang on 2018/4/11
 * 服务消费者：feign框架
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class ServiceFeignApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(ServiceFeignApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
    }
}
