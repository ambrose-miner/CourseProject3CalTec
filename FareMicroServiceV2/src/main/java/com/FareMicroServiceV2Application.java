package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan(basePackages = "com.bean")	
@EnableJpaRepositories(basePackages = "com.repository")
public class FareMicroServiceV2Application {
	public RestTemplate restTemplate() {
		return new RestTemplate();
		}
	public static void main(String[] args) {
		SpringApplication.run(FareMicroServiceV2Application.class, args);
	}

}
