package com.javaproject.variable.staticvariable;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Product {
    public static final String item  = "MICROWAVE";
    public int PRICE = 7500;

    public static void main(String[] args) {
        String colour = "BLACK";
        Product name = new Product();
        log.info(item);
        log.info(name.PRICE);
    }
}
