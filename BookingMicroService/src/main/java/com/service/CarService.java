package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
//	public String findCar(String car) {
//		String car = restTemplate.getForObject("http://account-micro-service/account/findAccountNumber/\"+emailid, Integer.class")
}
