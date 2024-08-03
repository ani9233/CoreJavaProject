package com.javaproject.exceptionhandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Exception {
    public static void main(String[] args) {
        Exception exception = new Exception();
        int output = exception.divide(10,2);
        log.info("Output:{}",output);
    }

    public int divide(int input1, int input2){
        int resp = input1/input2;
        return resp;
    }
}
