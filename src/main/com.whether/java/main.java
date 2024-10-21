// package main.java;
// public package weather;

import java.util.Timer;
import java.util.TimerTask;

public class main {
    public static void main(String[] args) {
        // Start the weather service
        // WeatherService weatherService = new WeatherService();
        Timer timer = new Timer();

        // Schedule to fetch weather data every 5 minutes (300,000 milliseconds)
        // timer.schedule(new TimerTask() {
        //     @Override
        //     public void run() {
        //         weatherService.fetchAndProcessWeatherData();
        //     }
        // }, 0, 300000); // 5 minutes

        System.out.println("Weather monitoring system started...");
    }
}
