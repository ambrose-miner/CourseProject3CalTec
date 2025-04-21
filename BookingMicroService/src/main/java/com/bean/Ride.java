package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
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
	@Column (value = "rideid") // error using "name" changed to "value" ???
	private int rideId;
	@Column (value = "username")
	private String userName;
	//private Car car;
	private String pickup;
	private String dropoff;
	
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public Car getCar() {
//		return car;
//	}
//	public void setCar(Car car) {
//		this.car = car;
//	}
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
