package com.liuhao.springcloud.netflix.zuul.gateway.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class NetflixZuulGatewaySecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulGatewaySecondApplication.class, args);
	}
}
