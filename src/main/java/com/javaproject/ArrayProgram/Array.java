package com.javaproject.ArrayProgram;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Array {

    public static void main(String[] args) {
        Array name = new Array();
        name.getarray1d();
        name.getarray1dint();
        name.getarray2d();
        name.getarray2dint();
    }

    public void getarray1d(){
        String[] student = new String[5];
        student[0] = "Anirudh";
        student[1] = "Roja";
        student[2] = "Rahul";
        student[3] = "Akshay";
        student[4] = "Anurag";

        for(int i =0;i<student.length;i++){
            log.info("Student names:{}",student[i]);
        }
    }

    public void getarray1dint(){

        String[] cities = {"Delhi","Mumbai","Chennai","Kolkata","Bengaluru"};

        for(int i=0;i<cities.length;i++){
            log.info("City names:{}",cities[i]);
        }
    }

    public void getarray2d(){
        String [][] student1 = new String[2][3];
        int rows = student1.length;
        int cols = student1[0].length;
        student1 [0][0] = "Anirudh";
        student1 [0][1] = "Roja";
        student1 [0][2] = "Rahul";
        student1 [1][0] = "Akshay";
        student1 [1][1] = "Anurag";
        student1 [1][2] = "Sandeep";

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                log.info("Student names:{}",student1[i][j]);
            }
        }

    }

    public void getarray2dint(){
        int numbers[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                          };

        for(int i=0;i<numbers.length;i++) {
            for (int j = 0; j <numbers[0].length; j++) {
                log.info("Numbers:{}", numbers[i][j]);
            }
        }
    }

}

