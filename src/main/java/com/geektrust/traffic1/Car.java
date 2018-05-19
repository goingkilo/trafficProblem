package com.geektrust.traffic1;

/**
 * Created by kraghunathan on 5/12/18.
 */
public class Car extends AVehicle {

    public Car() {

        allowedWeather.add(Weather.RAINY);
        allowedWeather.add(Weather.WINDY);
        allowedWeather.add(Weather.SUNNY);
    }

    public String getName() {
        return "Car";
    }

    public float getSpeed() {
        return 20;
    }

    public float getCraterTime() {
        return 3;
    }

    public boolean allowed(Weather weather) {

        return allowedWeather.contains(weather);
    }
}
