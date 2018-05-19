package com.liuhao.springcloud.netflix.zuul.gateway;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulGatewayApplication.class, args);
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
