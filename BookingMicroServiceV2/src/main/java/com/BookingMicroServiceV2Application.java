package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
@EntityScan(basePackages = "com.bean")	
@EnableJpaRepositories(basePackages = "com.repository")
	
public class BookingMicroServiceV2Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookingMicroServiceV2Application.class, args);
	}

}