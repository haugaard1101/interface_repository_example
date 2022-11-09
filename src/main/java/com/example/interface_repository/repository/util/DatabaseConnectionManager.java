package com.example.interface_repository.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    private DatabaseConnectionManager() {}

    public static Connection getConnection(){
        if(conn != null){
            return conn;
        }

        hostname = "jdbc:mysql://localhost/webshop";
        username = "root";
        password = "1234";
        try {
            conn = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
