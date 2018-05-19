package com.geektrust.traffic1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kraghunathan on 5/12/18.
 */
public abstract class AVehicle {

    public Set<Weather> allowedWeather ;

    public AVehicle() {
        allowedWeather = new HashSet<Weather>();
    }

    public abstract String getName();
    public abstract float getSpeed();




    public abstract float getCraterTime();

    public boolean allowed(Weather weather) {
        return false;
    }

    public void addAllowedWeather(Weather  allowedWeather) {
        this.allowedWeather.add(allowedWeather);
    }

    public void removeAllowedWeather(Weather  allowedWeather) {
        this.allowedWeather.remove(allowedWeather);
    }



}
