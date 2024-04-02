package com.ksbhat.java.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class HandlingMultipleExceptions {
    public static void main(String[] args) {
        try {
        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
