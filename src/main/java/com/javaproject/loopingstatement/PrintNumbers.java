package com.javaproject.loopingstatement;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class PrintNumbers {

    public void printnumbers(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printspaces(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = i; k < n; k++){
            System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintNumbers number = new PrintNumbers();
        int response = scanner.nextInt();
        number.printnumbers(response);
        log.info("response:{}", response);
        number.printspaces(response);
        log.info("response:{}", response);
    }


}