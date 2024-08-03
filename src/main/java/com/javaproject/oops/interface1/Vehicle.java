package com.javaproject.oops.interface1;

public interface Vehicle {
    public int no_of_doors = 4;

    void engine();

    default void gearBox(){
        System.out.println("Gear Box1");
    }
}
