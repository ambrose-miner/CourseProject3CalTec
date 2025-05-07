package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.repository.RideRepository;
import com.bean.Ride;

@Service
public class RideService {
@Autowired RideRepository RideRepository;
@Autowired
RestTemplate restTemplate;

	public String storeRideInfo(Ride rI) {
		try {
		RideRepository.findRideDistance(rI.getPickup(), rI.getDropoff());
		return "This Ride Already Exists";
		}catch(Exception e) {
			System.err.println(e);
			RideRepository.save(rI);
			return "Fare Information stored";
		}
	}
}

