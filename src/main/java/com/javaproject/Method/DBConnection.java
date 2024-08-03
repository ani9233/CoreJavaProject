package com.javaproject.Method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DBConnection {

    /**
     * Static Method
     */
    public static String getConnection(String username, String password){
        // connect with DB
        String connection = username.concat(":").concat(password);
        return connection;
    }

    public static void main(String[] args) {
        String response = DBConnection.getConnection("root", "password");
        log.info(response);
    }
}

