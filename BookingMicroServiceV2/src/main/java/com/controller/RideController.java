package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.service.RideService;
import com.bean.Ride;


@Controller //view must be in this micro service project with controller as opposed to rest controller
public class RideController {
	@Autowired
	RideService rideService;
	
	@GetMapping(value = "/")
	public String bookingLandingPage(Model mm, Ride r) {
		//System.out.println("I came here");
		mm.addAttribute("ride", r);
		return "ride-booking";
	}
	
	@PostMapping(value = "/bookRide")
	public String bookRide(Model mm, Ride r) {
		 //mm.addAttribute("pickup"); Stores values with out these lines...
		 //mm.addAttribute("dropoff");
		 //mm.addAttribute("username");
		 System.out.println("Ride booked");
		 rideService.bookRide(r);
		 mm.addAttribute("msg", "Your Ride Is Booked");
		return "ride-booking";
	}
	
}