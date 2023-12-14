package com.mtech.mtech.repositories;

import com.mtech.mtech.models.CarBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBodyRepository extends JpaRepository<CarBody, Long> {

}