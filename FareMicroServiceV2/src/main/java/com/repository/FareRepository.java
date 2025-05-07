package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Object>{

	@Query("select cf.distance from ridedistance cf where cf.pickup = :pickup and cf.dropoff = :dropoff")
	public float findFare(@Param("pickup") String pickup, @Param("dropoff") String dropoff);
	
	@Query("select cf.RideId from fare cf where cf.pickup = :pickup and cf.dropoff = :dropoff")
	public int findPickupAndDropoff(@Param("pickup") String pickup, @Param("dropoff") String dropoff);
}