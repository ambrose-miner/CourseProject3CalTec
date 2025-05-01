package com.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Fare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int rideid;
private String pickup;
private String dropoff;
private float price;

public int getRideId() {
	return rideid;
}
public void setRideId(int rideId) {
	rideid = rideId;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}