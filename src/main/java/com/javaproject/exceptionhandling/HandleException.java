package com.javaproject.exceptionhandling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HandleException {
    public static void main(String[] args) {
        HandleException exception = new HandleException();
        int output = exception.divide(10,3);
        log.info("Output:{}",output);
    }

    public int divide(int input1, int input2){
        int resp = 0;
        try {
            resp = input1 / input2;
        }
        catch(ArithmeticException ab){
            log.info("Exception while dividing both numbers",ab);
        }
        return resp;
    }
}

// Assignment
// pass string as input - valid string and pass null
// handle null pointer exception