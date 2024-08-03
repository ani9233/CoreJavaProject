package com.javaproject.constructor;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class Product {

        public static final String PRODUCT_NAME = "Phone";

        private String brandName;
        private int modelNumber;

        /**
         * Default constructor
         * to initialize the default value
         */
        public Product(){
            this.brandName = "Iphone";
            this.modelNumber = 1;
        }

        /**
         * Parameterized constructor
         * @param modelNumber
         * @param name
         */
        public Product(String name,int modelNumber){
            this.brandName = name;
            this.modelNumber = modelNumber;
        }


        public Product(int modelNumber, String name){
            this.brandName = name;
            this.modelNumber = modelNumber;
        }

        public static void main(String[] args) {
            Product prod = new Product();
            log.info("Product id:{} and Product name:{} ", prod.brandName, prod.modelNumber);

            Product prod1 = new Product(2, "Iphone2");
            log.info("Product id:{}, and Product name:{} ", prod1.brandName, prod1.modelNumber);

            Product prod2 = new Product("Iphone3",3);
            log.info("Product id:{}, and Product name:{} ", prod2.brandName, prod2.modelNumber);
        }
    }