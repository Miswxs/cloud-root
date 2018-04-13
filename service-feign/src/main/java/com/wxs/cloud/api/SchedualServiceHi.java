package com.wxs.cloud.api;

import com.wxs.cloud.service.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xiaoshen.wang on 2018/4/11
 * 通过@FeignClient("服务名")来指定调用哪个服务
 * Feign自带断路器
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
