package com.javaproject.practicesubstring;

public class Substringstat {

    public static void main(String[] args) {
        String name = "roja";
        String resp = name.substring(0,1);
        String out = resp.toUpperCase();
        System.out.println(out + name.substring(1));

    }
}
