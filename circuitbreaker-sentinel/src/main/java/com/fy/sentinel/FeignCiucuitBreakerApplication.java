package com.fy.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignCiucuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignCiucuitBreakerApplication.class, args);
    }
}
