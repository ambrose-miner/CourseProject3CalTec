package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Fare;
//import com.bean.Ride;
import com.repository.FareRepository;

@Service
public class FareService {

	@Autowired
	FareRepository FareRepository;
	@Autowired
	RestTemplate restTemplate;
	
	public String storeFareInfo(Fare fI) {
		try {
		FareRepository.findPickupAndDropoff(fI.getPickup(), fI.getDropoff());
		return "This Fare Alreay Exists";
		}catch(Exception e) {
			System.err.println(e);
			FareRepository.save(fI);
			return "Fare Information stored";
		}
		
	}
	
	public float findFare(String pickup, String dropoff) {
		try {
			return FareRepository.findFare(pickup, dropoff);
		} catch (Exception e) {
			System.err.println(e);
			return -1;
		}
	}
//	public int showRideId(Ride ride) {
//		Optional<Ride> result = JpaRepository.findById(ride.getRideId());
//		if(result.isPresent()) {
//			Ride activeRide = result.get();
//			float activePrice = activeRide.getPrice();
//			return "Your ride will cost"+price;
//		}else {
//			return "Sorry ride failed, Please try again";
//		}
}