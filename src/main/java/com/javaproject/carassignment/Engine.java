package com.javaproject.carassignment;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {
    public int engineNo;
    public String engineType;

    public Engine(int engineNo,String engineType){
        this.engineNo = engineNo;
        this.engineType = engineType;
    }

   public void getenginedetails(){
       log.info("engineNo:{} and engineType:{}", engineNo, engineType);
   }
}
