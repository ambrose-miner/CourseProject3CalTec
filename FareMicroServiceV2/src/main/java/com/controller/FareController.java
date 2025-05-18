package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Fare;
import com.service.FareService;

@RestController //test these end points with postman
@RequestMapping("fare")
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
	@DeleteMapping(value = "deleteFareRout/{pickup}/{dropoff}")
	public void deleteFareRout(@PathVariable String pickup, @PathVariable String dropoff) { // will compile but not produce result.
		System.out.println(pickup +" "+dropoff +" route deleted");
		FareService.deleteFareRout(pickup, dropoff); // no return needed on a delete method
	}
	@GetMapping(value = "displayFareRout/{fareid}")
	public int displayFareRout(@PathVariable int fareid) {
		System.out.println("Fare info for Id number" +" "+fareid);
		return FareService.displayFareRout(fareid);
	}
}