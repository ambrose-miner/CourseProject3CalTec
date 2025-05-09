package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Course3ProjectServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Course3ProjectServerApplication.class, args);
		System.out.println("server up on port 8761");
	}

}
