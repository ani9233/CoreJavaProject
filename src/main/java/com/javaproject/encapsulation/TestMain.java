package com.javaproject.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("Ani");
        String name = employee.getEmployeeName();
        log.info(name);

        employee.setEmployeeNo(1234);
        log.info(employee.getEmployeeNo());

        employee.setEmployeeBatch("ABC");
        log.info(employee.getEmployeeBatch());

        employee.setEmployeeEmail("abc@gmail.com");
        log.info(employee.getEmployeeEmail());

    }
}
