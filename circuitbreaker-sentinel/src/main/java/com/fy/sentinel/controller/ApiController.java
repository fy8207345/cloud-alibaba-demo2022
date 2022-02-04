package com.fy.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class ApiController {

    @GetMapping("/default/{ok}")
    public String defaultConfig(@PathVariable boolean ok) throws InterruptedException {
        if(ok){
//            TimeUnit.SECONDS.sleep(5);
            return "ok";
        }
        throw new RuntimeException("fail");
    }

    @GetMapping("/feign/{ok}")
    public String feignConfig(@PathVariable boolean ok) throws InterruptedException {
        if(ok){
//            TimeUnit.SECONDS.sleep(5);
            return "ok";
        }
        throw new RuntimeException("fail");
    }

    @GetMapping("/feignMethod/{ok}")
    public String feignMethodConfig(@PathVariable boolean ok) throws InterruptedException {
        if(ok){
//            TimeUnit.SECONDS.sleep(5);
            return "ok";
        }
        throw new RuntimeException("fail");
    }
}
