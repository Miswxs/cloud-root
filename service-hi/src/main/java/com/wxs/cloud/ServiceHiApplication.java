package com.wxs.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoshen.wang on 2018/4/10
 * 向eureka中心注册服务
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args){
        new SpringApplicationBuilder(ServiceHiApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi "+name+",I am from port "+port+"，你为什么不找我玩！";
    }
}
