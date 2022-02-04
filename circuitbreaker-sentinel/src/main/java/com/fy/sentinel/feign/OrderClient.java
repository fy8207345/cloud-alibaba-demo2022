package com.fy.sentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "order", url = "http://localhost:${server.port}", fallback = OrderClientFallback.class)
public interface OrderClient {

    @GetMapping("/default/{ok}")
    String defaultConfig(@PathVariable(value = "ok") boolean ok);
}
