package com.spring.cloud.netflix.eureka.client.service.provider.service;

import com.liuhao.springcloud.api.service.HiService;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {
    @Override
    public String hi() {
        return "hi";
    }
}
