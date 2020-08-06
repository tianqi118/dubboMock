package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.dubbo.mock.facade.HelloService;
import com.dubbo.mock.facade.MerchantApiService;
import com.dubbo.mock.model.MerchantInfoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangtianqi20
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;
    @Reference
    private MerchantApiService merchantApiService;

    @RequestMapping(value = "/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("BJQ"));
        return hello;
    }

    @RequestMapping(value = "/merch")
    public String merch() {
        List<MerchantInfoVO> merchantInfoVOS = merchantApiService.listMerchantInfo();
        String merch = JSON.toJSONString(merchantInfoVOS);
        System.out.println(merch);
        return merch;
    }
}
