package com.wzq.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-WZQ-A")
public interface ServerAFeignClient {
    @RequestMapping("/hello")
    public String hello();
}
