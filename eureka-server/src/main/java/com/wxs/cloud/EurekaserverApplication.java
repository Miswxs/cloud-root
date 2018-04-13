package com.wxs.cloud;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xiaoshen.wang on 2018/4/10
 * Eureka服务注册与发现中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaserverApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
    }
}
