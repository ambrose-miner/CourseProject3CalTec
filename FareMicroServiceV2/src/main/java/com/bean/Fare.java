package com.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Fare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int fareid;
private String pickup;
private String dropoff;
private float price;


public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getFareid() {
	return fareid;
}
public void setFareid(int fareid) {
	this.fareid = fareid;
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