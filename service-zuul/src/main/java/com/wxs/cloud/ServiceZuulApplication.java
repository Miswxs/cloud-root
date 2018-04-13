package com.wxs.cloud;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by xiaoshen.wang on 2018/4/12
 * 开启zuul功能，并注册服务到eureka
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ServiceZuulApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
    }
}
