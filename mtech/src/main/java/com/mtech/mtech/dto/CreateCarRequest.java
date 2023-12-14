package com.mtech.mtech.dto;

import java.util.List;
import java.util.ArrayList;

public class CreateCarRequest {

    private List<Long> carBodyIds;
    private List<Long> carWheelsIds;
    private String name;

    public CreateCarRequest() {
        this.carBodyIds = new ArrayList<>();
        this.carWheelsIds = new ArrayList<>();
        this.name = "";
    }

    public List<Long> getCarBodyIds() {
        return carBodyIds;
    }

    public void setCarBodyIds(List<Long> carBodyIds) {
        this.carBodyIds = carBodyIds;
    }

    public List<Long> getCarWheelsIds() {
        return carWheelsIds;
    }

    public void setCarWheelsIds(List<Long> carWheelsIds) {
        this.carWheelsIds = carWheelsIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}