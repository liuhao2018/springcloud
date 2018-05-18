package com.liuhao.springcloud.netflix.eureka.client.service.consumer.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(value =
        "netflix-eureka-client-service-provider",fallback = FallbackFeignClient.class)
public interface FeignClient {
    @GetMapping("/hi")
    String hi();
}
