package com.javaproject.loopingstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class ForLoop {
    public int i;
    int n;

    public static void main(String[] args) {
        ForLoop array = new ForLoop();
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the number");
        int n = scanner.nextInt();
           array.getincrement(n);
          array.getdecrement(n);
           array.get2d(n);
        array.get2drev(n);
    }

    public void getincrement(int n) {

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public void getdecrement(int n) {

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public void get2d(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void get2drev(int n) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }

}
