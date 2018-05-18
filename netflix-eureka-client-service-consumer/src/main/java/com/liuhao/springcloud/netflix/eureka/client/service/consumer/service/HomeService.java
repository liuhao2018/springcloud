package com.liuhao.springcloud.netflix.eureka.client.service.consumer.service;

import com.liuhao.springcloud.api.service.HiService;
import com.liuhao.springcloud.netflix.eureka.client.service.consumer.feign.FeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URISyntaxException;

@Service
public class HomeService implements HiService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public DiscoveryClient discoveryClient;

    @Autowired
    private FeignClient feignClient;


    /**
     * 熔断
     * @return
     * @throws URISyntaxException
     */
//    @HystrixCommand(fallbackMethod = "defaultResponse")
//    @Override
//    public String hi() {
////        如果部署了多个提供方 会通过负载均衡请求到某一个提供方
//        String serviceId = "netflix-eureka-client-service-provider";
//        String url = "http://" + serviceId +"/hi";
//        return restTemplate.getForObject(url,String.class);
//    }

    /**
     * 失败处理
     * @return
     */
    public String defaultResponse() {
        return "welcome";
    }


    @Override
    public String hi() {
        return feignClient.hi();
    }
}
