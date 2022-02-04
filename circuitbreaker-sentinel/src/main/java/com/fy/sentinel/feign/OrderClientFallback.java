package com.fy.sentinel.feign;

import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClient{
    @Override
    public String defaultConfig(boolean ok) {
        return "order fallback";
    }
}
