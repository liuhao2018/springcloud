package com.liuhao.springcloud.netflix.eureka.client.gateway.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@org.springframework.cloud.openfeign.FeignClient(value = "netflix-zuul-gateway")
public interface FeignClient {
    @RequestMapping(value = "/{requestUri}")
    String main(@PathVariable("requestUri") String requestUri);
}
