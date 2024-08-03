package com.javaproject.variable.staticvariable;

import com.sun.jdi.PathSearchingVirtualMachine;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    // static variable
    public static String BANK_NAME = "JPMC";

    // instance variable
    private long accountNo = 1000l;
    private String accountName = "Roja";

    public static void main(String[] args) {
        // invoke static variable
        log.info(Account.BANK_NAME);

        // instance variable
        Account account = new Account();
        log.info(account.accountNo);
        log.info(account.accountName);

        // local variable
        int interest = 10;
        log.info(interest);
    }
}
