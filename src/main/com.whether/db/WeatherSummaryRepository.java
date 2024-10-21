package com.weather.db;

import com.weather.WeatherSummary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WeatherSummaryRepository {
    private DatabaseConnection dbConnection;

    public WeatherSummaryRepository() {
        dbConnection = new DatabaseConnection();
    }

    public void saveWeatherSummary(WeatherSummary summary) {
        String query = "INSERT INTO weather_summary (temperature, condition) VALUES (?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setDouble(1, summary.getTemperature());
            pstmt.setString(2, summary.getCondition());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
