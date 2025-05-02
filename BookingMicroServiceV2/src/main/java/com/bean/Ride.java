package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
@Scope("prototype")
public class Ride {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rideid;
	private String username;
	private String pickup;
	private String dropoff;
	private int carvalue;
	
	public int getCarvalue() {
		return carvalue;
	}
	public void setCarvalue(int carvalue) {
		this.carvalue = carvalue;
	}
	public int getRideId() {
		return rideid;
	}
	public void setRideId(int rideId) {
		this.rideid = rideId;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public String getDropoff() {
		return dropoff;
	}
	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}
	
}
