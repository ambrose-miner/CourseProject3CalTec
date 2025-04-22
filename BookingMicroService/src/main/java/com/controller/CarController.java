//package com.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.service.CarService;
//import com.bean.Ride;
//
//@Controller
//public class CarController {
//	@Autowired
//	CarService carService;
//	@GetMapping(value = "findCar/{car}")
//	public String findCar(@PathVariable("car") String car) {
//		return carService.findCar(car);
//	}
//}