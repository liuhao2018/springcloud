package com.liuhao.springcloud.netflix.eureka.client.gateway.feign;

import org.springframework.stereotype.Component;

@Component
public class FallbackFeignClient implements FeignClient {
    @Override
    public String main(String requestUri) {
        return "服务不可用";
    }
}
