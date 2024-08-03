package com.javaproject.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2

    public class Employee {
        public static final String ORG_NAME ="TCS";

        private int employeeId;
        private String employeeName;

        /**
         * Default constructor
         * to initialize the default value
         */
        public Employee(){
            this.employeeId = 1;
            this.employeeName = "Regu";
        }

        /**
         * Parameterized constructor
         * @param id
         * @param name
         */
        public Employee(int id, String name){
            this.employeeId = id;
            this.employeeName = name;
        }


        public Employee(String name, int id){
            this.employeeId = id;
            this.employeeName = name;
        }

        public static void main(String[] args) {
            Employee employee1 = new Employee();
            log.info("Employee id:{} and employee name:{} ", employee1.employeeId, employee1.employeeName);
       //   log.info("Employee id:" + employee1.employeeId + " and " + "Employee name:" + employee1.employeeName);

            Employee employee2 = new Employee(2, "Rakesh");
            log.info("Employee id:{}, and employee name:{} ", employee2.employeeId, employee2.employeeName);

            Employee employee3 = new Employee("Saranya",3);
            log.info("Employee id:{}, and employee name:{} ", employee3.employeeId, employee3.employeeName);
        }
    }

