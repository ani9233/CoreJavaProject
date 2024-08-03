package com.javaproject.breakcontinue;

public class Break {

    public static void main(String[] args) {
        Break name = new Break();
        name.getbreak();
        System.out.println();
        name.getcont();

    }

    public void getbreak() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            if (i == 3)
                break;
            System.out.print(i);
        }
    }

    public void getcont() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            if (i == 3)
                continue;
            System.out.print(i);
        }
    }
}
