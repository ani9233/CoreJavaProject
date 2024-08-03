package com.javaproject.carassignment;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {

    public static void main(String[] args) {
        Car type = new Car(3825,"SUV");
        type.getcardetails();

    }
}
