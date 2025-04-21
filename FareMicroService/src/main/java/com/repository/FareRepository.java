package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Integer>{

	@Query("select cf.price from Fare cf where cf.pickup = :pickup and cf.dropoff=:dropoff")
	public float findPrice(@Param("pickup") String pickup, @Param("dropoff") String dropoff);
	
	@Query("select cf.RideId from Fare cf where cf.pickup = :pickup and cf.dropoff=:dropoff")
	public int findPickupAndDropoff(@Param("pickup") String pickup, @Param("dropoff") String dropoff);
}