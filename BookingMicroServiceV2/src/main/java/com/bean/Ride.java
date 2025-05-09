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
	private float price;
	//private int carvalue;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//	public int getCarvalue() {
//		return carvalue;
//	}
//	public void setCarvalue(int carvalue) {
//		this.carvalue = carvalue;
//	}
	public int getRideId() {
		return rideid;
	}
	public void setRideId(int rideId) {
		this.rideid = rideId;
	}
	
	public int getRideid() {
		return rideid;
	}
	public void setRideid(int rideid) {
		this.rideid = rideid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
