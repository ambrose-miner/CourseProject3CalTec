package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bean.Ride;
@Repository
public interface RideRepository extends JpaRepository<Ride, Integer> {

}