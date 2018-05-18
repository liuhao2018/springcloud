package com.liuhao.springcloud.netflix.eureka.client.service.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class FallbackFeignClient implements FeignClient {
    @Override
    public String hi() {
        return "fallback";

    }
}
