package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Integer>{

	@Query("select cf.price from Fare cf where cf.pickup = :pickupA and cf.dropoff = :dropoffB")
	public float findFare(@Param("pickupA") String pickup, @Param("dropoffB") String dropoff);
	
	@Query("select cf.fareid from Fare cf where cf.pickup = :pickupA and cf.dropoff = :dropoffB")
	public int findPickupAndDropoff(@Param("pickupA") String pickup, @Param("dropoffB") String dropoff);
	
	@Modifying
	@Transactional
	@Query("delete from Fare cf where cf.pickup = :pickupA and cf.dropoff = :dropoffB")
	public void deletePickupAndDropoff(@Param("pickupA") String pickup, @Param("dropoffB") String dropoff);
	//test above Query... Used to delete fare routes from the table with out having to know the fareid.
	
	Optional<Fare> displayFareRout(); //should not need to pass fareid its @Id of @Entity class 
	
	List<Fare> diplayAllFareRouts(); //not written other parts yet.
}