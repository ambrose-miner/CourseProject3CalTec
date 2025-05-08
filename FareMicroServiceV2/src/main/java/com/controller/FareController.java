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
@RequestMapping("Fare")
public class FareController {

	@Autowired
	FareService FareService;
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeFareInfo(@RequestBody Fare fare) {
		return FareService.storeFareInfo(fare);
	}
	@GetMapping(value = "findFare/{pickup}/{dropoff}")
	public float findFare(@PathVariable String pickup, @PathVariable String dropoff) {
		System.out.println(pickup +" "+dropoff);
		return FareService.findFare(pickup, dropoff);
	}
}