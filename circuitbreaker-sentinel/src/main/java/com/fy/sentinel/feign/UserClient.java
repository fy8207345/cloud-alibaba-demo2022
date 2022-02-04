package com.fy.sentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user", url = "http://localhost:${server.port}", fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/feignMethod/{ok}")
    String feignMethod(@PathVariable(value = "ok") boolean ok);

    @GetMapping("/feign/{ok}")
    String feign(@PathVariable(value = "ok") boolean ok);
}
