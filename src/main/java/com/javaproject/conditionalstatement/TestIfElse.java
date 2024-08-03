package com.javaproject.conditionalstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class TestIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter your age");
        int resp = scanner.nextInt();
        TestIfElse age = new TestIfElse();
        age.getage(resp);
    }

    public void getage(int resp) {

        if (resp < 18) {
            log.info("Not eligible for license");
        } else if (resp > 60) {
            log.info("Beyond age limit");
        } else {
            log.info("Eligible for licence");
        }
    }
}

