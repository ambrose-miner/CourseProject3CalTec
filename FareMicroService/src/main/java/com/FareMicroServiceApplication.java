package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")	
@EnableJdbcRepositories(basePackages = "com.repository")

public class FareMicroServiceApplication {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(FareMicroServiceApplication.class, args);
	}

}
