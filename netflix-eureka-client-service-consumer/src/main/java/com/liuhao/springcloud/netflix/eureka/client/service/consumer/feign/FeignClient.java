package com.liuhao.springcloud.netflix.eureka.client.service.consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@org.springframework.cloud.openfeign.FeignClient(serviceId = "netflix-eureka-client-service-provider")
public interface FeignClient {
    @GetMapping("/hi")
    String hi();
}
