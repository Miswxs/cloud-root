package com.wxs.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaoshen.wang on 2018/4/11
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * @HystrixCommand 创建熔断器的功能并指定熔断方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod="hiError")
    public String hiService(String name){
       return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi "+name+" ,sorry ,error!";
    }
}
