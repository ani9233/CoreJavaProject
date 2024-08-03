package com.javaproject.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Customer {

    public static final Long ACC_NO = 1234L;

    private int custid;
    private String customerName;

    /**
     * Default constructor
     * to initialize the default value
     */
    public Customer(){
        this.custid = 123;
        this.customerName = "ROJA";
    }

    /**
     * Parameterized constructor
     * @param id
     * @param name
     */
    public Customer(int id, String name){
        this.custid = id;
        this.customerName = name;
    }


    public Customer(String name, int id){
        this.custid = id;
        this.customerName = name;
    }

    public static void main(String[] args) {
        Customer cust = new Customer();
        log.info("Customer id:{} and Customer name:{} ", cust.custid, cust.customerName);

        Customer cust1 = new Customer(2, "Rajaiah");
        log.info("Customer id:{}, and Customer name:{} ", cust1.custid, cust1.customerName);

        Customer cust2 = new Customer("Anirudh",3);
        log.info("Customer id:{}, and Customer name:{} ", cust2.custid, cust2.customerName);
    }
}
