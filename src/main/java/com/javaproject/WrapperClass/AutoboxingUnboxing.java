package com.javaproject.WrapperClass;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AutoboxingUnboxing {

    public int unboxing(Integer input1,Integer input2) {
        int resp = input1 + input2;
        return resp;
    }

    public int autoboxing(int input3,int input4) {
        Integer resp2 = input3 - input4;
        return resp2;
    }

    public static void main(String[] args) {
        AutoboxingUnboxing resp1 = new AutoboxingUnboxing();
        int output = resp1.unboxing(10,20);
        log.info("output:{}",output);
        Integer output1 = resp1.autoboxing(50,25);
        log.info("output1:{}",output1);
    }
}
