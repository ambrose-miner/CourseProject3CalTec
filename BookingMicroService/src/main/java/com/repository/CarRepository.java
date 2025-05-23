package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bean.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}