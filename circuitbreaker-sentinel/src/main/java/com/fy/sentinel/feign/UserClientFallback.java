package com.fy.sentinel.feign;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient{

    @Override
    public String feignMethod(boolean ok) {
        return "user fallback";
    }

    @Override
    public String feign(boolean ok) {
        return "user fallback";
    }
}
