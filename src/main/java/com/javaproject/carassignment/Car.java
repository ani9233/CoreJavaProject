package com.javaproject.carassignment;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Car {
    public int carModel;
    public String carType;

    public Car(int carModel, String carType) {
        this.carModel = carModel;
        this.carType = carType;
    }

    public void getcardetails() {
        log.info("carModel:{} and carType:{}", carModel, carType);
        Engine name = new Engine(2,"XP");
        name.getenginedetails();
    }
}


