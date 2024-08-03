package com.javaproject.Method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Calculator {

    public int add(int input1, int input2) {
        int response = input1 + input2;
        return response;
    }

    public void addition(int input1, int input2) {
        int response = input1 + input2;
        log.info("Output:{}", response);
    }

    public int sub(int input1, int input2) {
        int response = input1 - input2;
        return response;
    }

    public long mul(long input1, long input2) {
        long response = input1 * input2;
        return response;
    }

    public float div(float input1, float input2) {
        float response = input1 / input2;
        return response;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(4, 5);

        int output = calculator.add(10, 20);
        log.info("Addition of input1:{} and input2:{} and output:{}", 10, 20, output);

        int output2 = calculator.add(20, 30);
        log.info("Addition of input1:{} and input2:{} and output:{}", 20, 30, output2);

        int output3 = calculator.sub(130, 50);
        log.info("Subtraction of input1:{} and input2:{} and output:{}", 130, 50, output3);

        long output4 = calculator.mul(9999L, 2450L);
        log.info("Mul of input1:{} and input2:{} and output:{}", 9999, 2450, output4);

        float output5 = calculator.div(50.25f, 7.97f);
        log.info("Div of input1:{} and input2:{} and output:{}", 50.25, 7.97, output5);
    }
}
