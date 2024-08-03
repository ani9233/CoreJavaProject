package com.javaproject.practicearraylist;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EmployeeDetails {

    public void employeedetails(){
        Employee employee = new Employee();
        employee.setEmployeeName("Anirudh");
        employee.setEmployeeId(406022);
        employee.setEmployeeEmail("anirudhanand8@gmail.com");

        log.info("Employee name:{}", employee.getEmployeeName());
        log.info("Employee id:{}", employee.getEmployeeId());
        log.info("Employee email:{}", employee.getEmployeeEmail());
    }

}
