package com.liuhao.springcloud.netflix.eureka.server.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 第二个Eureka Server 高可用方案
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServerSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServerSecondApplication.class, args);
	}
}
