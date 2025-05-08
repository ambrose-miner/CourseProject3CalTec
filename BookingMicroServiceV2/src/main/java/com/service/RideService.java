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

@Autowired
RideRepository RideRepository;
@Autowired
RestTemplate restTemplate;

	public String bookRide(Ride rI) {
		Optional<Ride> result = RideRepository.findById(rI.getRideId());
		if(result.isPresent()) {
		return "This Ride is Already Booked";
		
		}else {
			RideRepository.save(rI);
			return "Ride Information stored";
		}
	}
}

