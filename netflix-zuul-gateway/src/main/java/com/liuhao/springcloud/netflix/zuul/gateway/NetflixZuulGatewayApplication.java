package com.liuhao.springcloud.netflix.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 116.62.65.128
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulGatewayApplication.class, args);
	}
}
