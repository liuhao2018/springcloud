package com.liuhao.springcloud.netflix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServerApplication.class, args);
	}
}
