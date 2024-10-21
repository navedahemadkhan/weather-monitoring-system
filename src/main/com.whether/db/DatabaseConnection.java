// package com.weather.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final String URL = "jdbc:postgresql://postgres:5432/weather_db"; // Change as necessary
    private final String USER = "myuser"; // Change as necessary
    private final String PASSWORD = "mypassword"; // Change as necessary

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
