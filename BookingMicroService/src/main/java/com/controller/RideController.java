package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		mm.addAttribute("msg", "Simple testing message");
		mm.addAttribute("ride", r);
		return "ride-booking";
	}
//	@GetMapping(value = "/populateDropDownList", method = RequestMethod.GET) 
//	public String populateList(Model model) {
//	    List<String> options = new ArrayList<String>();
//	    options.add("Basic Car");
//	    options.add("Luxury Car");
//	  	options.add("Limousine ");
//	    model.addAttribute("options", options);
//	    return "dropDownList/dropDownList.html";
//	} Prototype method for a populating drop down list allowing the easy addition of cars to choose from.
}

