package com.fy.sentinel.controller;

import com.fy.sentinel.feign.OrderClient;
import com.fy.sentinel.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private OrderClient orderClient;
    @Value("${feign.circuitbreaker.enabled}")
    private boolean enabled;

    @GetMapping("/test/default/{ok}")
    public String testDefault(@PathVariable boolean ok) {
        return orderClient.defaultConfig(ok);
    }

    @GetMapping("/test/feign/{ok}")
    public String testFeign(@PathVariable boolean ok) {
        return userClient.feign(ok);
    }

    @GetMapping("/test/feignMethod/{ok}")
    public String testFeignMethod(@PathVariable boolean ok) {
        return userClient.feignMethod(ok);
    }

    @GetMapping("/enabled")
    public boolean isEnabled(){
        return enabled;
    }
}
