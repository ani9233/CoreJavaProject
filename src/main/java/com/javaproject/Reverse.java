package com.javaproject;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Reverse {

    public static void main(String[] args) {
        Reverse type = new Reverse();
        type.getnameupper();
        System.out.println();
        type.getnamereverse();
    }

    public void getnamereverse() {
        String name = "roja";
        char[] rev = name.toCharArray();
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i]);
        }
    }

    public void getnameupper() {
        String name = "roja";
        char[] rev = name.toCharArray();
        for (int i = 0; i <= rev.length - 1; i++) {
            if (i == 0) {
                char ch = rev[i];
                String s = Character.toString(ch);
                String s1 = s.toUpperCase();
                char[] rev1 = s1.toCharArray();
                System.out.print(s1);
            } else {
                System.out.print(rev[i]);
            }

        }

    }
}


