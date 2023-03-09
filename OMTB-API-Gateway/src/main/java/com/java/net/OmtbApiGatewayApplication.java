package com.java.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OmtbApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmtbApiGatewayApplication.class, args);
	}

}
