package com.spring.cloud.netflix.eureka.client.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 客户端 服务提供方
 */
@EnableEurekaClient
@SpringBootApplication
public class NetflixEurekaClientServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaClientServiceProviderApplication.class, args);
	}
}
