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
private int price;


public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRideid() {
	return rideid;
}
public void setRideid(int rideid) {
	this.rideid = rideid;
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