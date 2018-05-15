package com.spring.cloud.netflix.eureka.client.service.provider.controller;

import com.liuhao.springcloud.api.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class HiController {

    @Autowired
    public HiService hiService;


    @GetMapping("/hi")
    public String hi() {
        try {
            return hiService.hi();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "";
        }
    }
}
