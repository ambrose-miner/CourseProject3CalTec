package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.RideService;
import com.bean.Ride;

@Controller
public class RideController {
	@Autowired
	RideService rideService;
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value = "/")
	public String bookingLandingPage(Model mm, Ride r) {
		//System.out.println("I came here");
		mm.addAttribute("ride", r);
		return "ride-booking";
	}
	
	@PostMapping(value = "/bookRide")
	public String bookRide(Model mm, Ride r) {
		 mm.addAttribute("pickup");
		 mm.addAttribute("dropoff");
		 mm.addAttribute("username");
		return "ride-booking";
	}
	
}