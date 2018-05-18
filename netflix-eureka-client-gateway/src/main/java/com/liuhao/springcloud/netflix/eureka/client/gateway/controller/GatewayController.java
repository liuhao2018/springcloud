package com.liuhao.springcloud.netflix.eureka.client.gateway.controller;

import com.liuhao.springcloud.netflix.eureka.client.gateway.feign.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController("/")
public class GatewayController {


    @Autowired
    public FeignClient feignClient;

    @RequestMapping
    public String main(HttpServletRequest request) {
        return feignClient.main(request.getRequestURI());
    }

}
