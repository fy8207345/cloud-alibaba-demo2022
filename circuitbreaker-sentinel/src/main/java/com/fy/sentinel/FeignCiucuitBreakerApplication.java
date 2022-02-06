package com.fy.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {ArchaiusAutoConfiguration.class})
@EnableFeignClients
@EnableDiscoveryClient
public class FeignCiucuitBreakerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FeignCiucuitBreakerApplication.class, args);
        String value = applicationContext.getEnvironment().getProperty("feign.circuitbreaker.enabled");
        String value2 = applicationContext.getEnvironment().getProperty("feign.sentinel.rules.default[0].timeWindow");
        System.out.println(value);
        System.out.println(value2);
    }
}
