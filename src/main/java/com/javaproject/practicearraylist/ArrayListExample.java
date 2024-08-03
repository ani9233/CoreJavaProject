package com.javaproject.practicearraylist;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2
public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Anirudh");
        list1.add("Vivek");
        list1.add("Roja");
        list1.add("AJ");
        log.info(list1);
        ArrayListExample.disp();
        EmployeeDetails details = new EmployeeDetails();
        details.employeedetails();
    }

    public static void disp(){
        log.info("I am learning Java");
    }
}
