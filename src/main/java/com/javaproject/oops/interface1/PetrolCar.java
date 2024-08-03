package com.javaproject.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PetrolCar implements Vehicle, Vehicle1{

    public void engine(){
       log.info("Petrol Engine");
    }

    @Override
    public void gearBox() {
        Vehicle1.super.gearBox();
    }

}
