package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Fare;
import com.repository.FareRepository;

@Service
public class FareService {

	@Autowired
	FareRepository FareRepository;
	@Autowired
	RestTemplate restTemplate;
	
	public String storeFareInfo(Fare cb) {
		try {
		FareRepository.findPickupAndDropoff(cb.getPickup(), cb.getDropoff());
		return "Alreay information present";
		}catch(Exception e) {
			System.err.println(e);
			FareRepository.save(cb);
			return "Trip Information stored";
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
}