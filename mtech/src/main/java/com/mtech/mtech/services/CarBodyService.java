package com.mtech.mtech.services;

import com.mtech.mtech.models.CarBody;
import com.mtech.mtech.repositories.CarBodyRepository;

import java.util.List;
import java.util.Optional;

public class CarBodyService {
    
    private CarBodyRepository carBodyRepository;
    
    public CarBodyService(CarBodyRepository carBodyRepository) {
        this.carBodyRepository = carBodyRepository;
    }
    
    public void createCarBody(CarBody carBody) {
        carBodyRepository.save(carBody);
    }
    
    public void updateCarBody(CarBody carBody) {
        carBodyRepository.save(carBody);
    }
    
    public void deleteCarBody(Long id) {
        carBodyRepository.deleteById(id);
    }
    
    public List<CarBody> getAllCarBodies() {
        return carBodyRepository.findAll();
    }
    
    public Optional<CarBody> getCarBodyById(Long id) {
        return carBodyRepository.findById(id);
    }
}