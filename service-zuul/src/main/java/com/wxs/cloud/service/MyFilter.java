package com.wxs.cloud.service;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoshen.wang on 2018/4/12
 */
@Component
public class MyFilter extends ZuulFilter{

    /**
     *返回一个字符串代表过滤器的类型：
     *pre：路由之前 routing：路由之时
     *post： 路由之后 error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 逻辑判断：是否要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑，可用查sql或nosql去判断该请求是否有权限访问
     * @return
     */
    @Override
    public Object run() {
        return null;
    }
}
