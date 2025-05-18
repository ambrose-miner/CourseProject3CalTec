package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Fare;
//import com.bean.Ride;
import com.repository.FareRepository;


@Service
public class FareService {

	@Autowired
	FareRepository FareRepository;

	
	public String storeFareInfo(Fare fI) {
		int X = -1;
		try {
			X = FareRepository.findPickupAndDropoff(fI.getPickup(), fI.getDropoff());
		}catch(Exception e) {} //nothing needs to happen here!
			if (X > 0) {
			return "This Fare Alreay Exists";
				}else {					
		try {
			FareRepository.save(fI);
			return "Fare Information stored";
			}catch(Exception e) {
			System.err.println(e);
			return "Database Error";
			}
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
	public void deleteFareRout(String pickup, String dropoff) { //tested compiles but does not function...?
		try {
			FareRepository.deleatePickupAndDropoff(pickup, dropoff);
		}catch (Exception e) {
			System.err.println(e);
		}
	}

	public String displayFareRout(fareid Fid) { //problem with fareid...?
		try {
			FareRepository.displayFareRout(Fid.getPickup(), (Fid.getDropoff(), Fid.getPrice());
		}catch (Exception e) {
			System.err.println(e);
		return "Rout info for Id:" +fareid +" " +"Pickup: " +pickup +"Dropoff: " +dropoff +"Price: " +price); //does not like any of these variables
		}
	}
}