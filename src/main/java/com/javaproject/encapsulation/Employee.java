package com.javaproject.encapsulation;

public class Employee {

    private String employeeName;
    public int employeeNo;
    private String employeeBatch;
    private String employeeEmail;

    public String getEmployeeBatch() {
        return employeeBatch;
    }

    public void setEmployeeBatch(String employeeBatch) {
        this.employeeBatch = employeeBatch;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
