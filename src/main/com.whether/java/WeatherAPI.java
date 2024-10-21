// package com.weather;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherAPI {
    private final String API_KEY = "your_api_key"; // Replace with your actual API key
    private final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public WeatherSummary getWeatherData() {
        String response = "";
        try {
            URL url = new URL(BASE_URL + "Delhi,IN&appid=" + API_KEY + "&units=metric");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() == 200) {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    response += sc.nextLine();
                }
                sc.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Parse JSON response (use a library like Gson or Jackson)
        // For simplicity, let's assume we have a method that parses this and returns a WeatherSummary
        return parseWeatherResponse(response);
    }

    private WeatherSummary parseWeatherResponse(String response) {
        // JSON parsing logic goes here
        // Return a new WeatherSummary object based on parsed data
        return new WeatherSummary(/* parameters from parsed data */);
    }
}
