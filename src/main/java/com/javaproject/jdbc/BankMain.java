package com.javaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class BankMain {
    public static void main(String[] args) {
        try {
            Connection connection = DBConnection.getConnection();
            DBConnection.getConnection();
            log.info(connection);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
