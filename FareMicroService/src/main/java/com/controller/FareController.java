package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Fare;
import com.service.FareService;

@RestController
@RequestMapping("Fare")    // http://localhost:8282/cabfare/*
public class FareController {

	@Autowired
	FareService FareService;
	// http://localhost:8282/cabfare/create
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeFareInfo(@RequestBody Fare Fare) {
		return FareService.storeFareInfo(Fare);
	}
	
	// http://localhost:8282/cabfare/findFare/A/B
	
	@GetMapping(value = "findFare/{pickup}/{dropoff}")
	public float findFare(@PathVariable String pickup, @PathVariable String dropoff) {
		System.out.println(pickup +" "+dropoff);
		return FareService.findFare(pickup, dropoff);
	}
}