package com.wxs.cloud.service;

import com.wxs.cloud.api.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoshen.wang on 2018/4/11
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
