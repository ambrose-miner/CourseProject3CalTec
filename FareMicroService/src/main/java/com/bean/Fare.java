package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Fare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="rideid")
private int RideId;
private String pickup;
private String dropoff;
private float price;

public int getRideId() {
	return RideId;
}
public void setRideId(int rideId) {
	RideId = rideId;
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
public float getFare() {
	return price;
}
public void setFare(float fare) {
	this.price = fare;
}


}