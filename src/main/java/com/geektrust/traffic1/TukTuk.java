package com.geektrust.traffic1;

/**
 * Created by kraghunathan on 5/12/18.
 */
public class TukTuk extends AVehicle {

    public TukTuk() {
        allowedWeather.add(Weather.RAINY);
        allowedWeather.add(Weather.SUNNY);
    }

    public String getName() {
        return "TukTuk";
    }

    public float getSpeed() {
        return 12;
    }

    public float getCraterTime() {
        return 1;
    }

    public boolean allowed(Weather weather) {
        return allowedWeather.contains(weather);
    }
}
