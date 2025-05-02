package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.service.RideService;
import com.bean.Ride;

@Controller
public class RideController {
	@Autowired
	RideService rideService;
	@GetMapping(value = "/")
	public String bookingLandingPage(Model mm, Ride r) {
		mm.addAttribute("ride", r);
		return "ride-booking";
	}
	
	@PostMapping(value = "/bookRide")
	public String bookRide(Model mm, Ride r) {
		
		System.out.println(r);
		mm.addAttribute("msg", "Test message");
		mm.addAttribute("ride", r);
		return "ride-booking";
	}
}