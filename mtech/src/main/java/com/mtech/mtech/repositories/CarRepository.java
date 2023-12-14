package com.mtech.mtech.repositories;

import com.mtech.mtech.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}