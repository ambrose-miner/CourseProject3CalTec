package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bean.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Integer>{

	@Query("select cf.price from Fare cf where cf.pickup = :pickup1 and cf.dropoff = :dropoff1")
	public float findFare(@Param("pickup1") String pickup, @Param("dropoff1") String dropoff);
	
	@Query("select cf.fareid from Fare cf where cf.pickup = :pickup1 and cf.dropoff = :dropoff1")
	public int findPickupAndDropoff(@Param("pickup1") String pickup, @Param("dropoff1") String dropoff);
	
	@Query("delete from Fare where cf.pickup = :pickup1 and cf.dropoff = :dropoff1")
	public void deleatePickupAndDropoff(@Param("pickup1") String pickup, @Param("dropoff1") String dropoff);
	//test above Query... Used to delete fare routes from the table with out having to know the fareid.
}