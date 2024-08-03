package com.javaproject.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar();
        ElectricCar electricCar = new ElectricCar();
        petrolCar.engine();
        petrolCar.gearBox();
        electricCar.engine();
        log.info(PetrolCar.no_of_doors);
    }
}
