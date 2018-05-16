package com.liuhao.springcloud.netflix.eureka.client.service.consumer.controller;

import com.liuhao.springcloud.netflix.eureka.client.service.consumer.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeController {

    @Autowired
    public HomeService homeService;

    @GetMapping("/hi")
    public String hi() {
        return homeService.hi();
    }

}
