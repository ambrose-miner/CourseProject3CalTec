package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Component
@Scope("prototype")
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (value = "carid") // Internal tracking number only. This class should be extended to include license plate# and registration.
private int carId;
@Column (value = "cartype")
private String carType; // May be broken down further in to make and model.
@Column (value = "faremultiplyer")
private int fareMultiplyer; // Based on perceived value of carType.

public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public int getFareMultiplyer() {
	return fareMultiplyer;
}
public void setFareMultiplyer(int fareMultiplyer) {
	this.fareMultiplyer = fareMultiplyer;
}


}
