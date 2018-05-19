package com.geektrust.traffic1;

/**
 * Created by kraghunathan on 5/12/18.
 */
public class Bike extends AVehicle {

    public Bike () {
        allowedWeather.add(Weather.WINDY);
        allowedWeather.add(Weather.SUNNY);
    }

    public String getName() {

        return "Bike";
    }

    public float getSpeed() {

        return 10;
    }

    public float getCraterTime() {

        return 2;
    }

    public boolean allowed(Weather weather) {

        return allowedWeather.contains(weather);
    }
}
