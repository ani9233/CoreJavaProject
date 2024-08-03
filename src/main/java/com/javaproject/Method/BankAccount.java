
package com.javaproject.Method;

import lombok.extern.log4j.Log4j2;

import java.rmi.server.RemoteObjectInvocationHandler;

@Log4j2
public class BankAccount {
    public static final String BANK_NAME = "JPMC";
    public int accountNo;
    public String accountName;

    public BankAccount(int accountNo, String accountName) {

        this.accountNo = accountNo;
        this.accountName = accountName;
    }

    public static String getBankName() {
        return BANK_NAME;
    }

    public int getBankAccountNumber() {
        return accountNo;
    }

    public String getBankAccountName() {

        return accountName;
    }

    public static void main(String[] args) {

        // reference static method - Hence no need to create an object but we can create if we want
        String response = BankAccount.getBankName();
        log.info(response);

        /*  non static method cannot be referenced from a static context
         *   Creating of object is necessary here
         */

        BankAccount bank = new BankAccount(295, "Roja");

        int response1 = bank.getBankAccountNumber();
        String response2 = bank.getBankAccountName();

        log.info("Bank Account No:{} and Bank Account Name:{}", response1, response2);

    }
}
