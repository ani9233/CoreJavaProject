package com.javaproject.practicesubstring;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Substringinst {
    public String name = "roja";

    public static void main(String[] args) {
        Substringinst name1 = new Substringinst();
        name1.getsubstring();
    }
    public void getsubstring(){
        String resp = name.substring(0,1);
        String out = resp.toUpperCase();
        System.out.println(out + name.substring(1));
    }

}
