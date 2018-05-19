package com.geektrust.traffic1;

import com.geektrust.traffic1.exception.VehicleNotAllowedException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kraghunathan on 5/12/18.
 */
public class Vehicle {

    private Set<Weather> allowedWeather ;

    private String name;
    private int craterTime;
    private float speed;

    public Vehicle( String name, int craterTime, float speed, List<Weather> allowed) {
        this.name = name;
        this.craterTime = craterTime;
        this.speed = speed;

        allowedWeather = new HashSet<Weather>();
        allowedWeather.addAll( allowed);
    }

    public boolean allowed(Weather weather) {
        return allowedWeather.contains(weather);
    }

    public float timeTaken( Orbit orbit, Weather weather)throws VehicleNotAllowedException{
        if( !allowed( weather))
            throw new VehicleNotAllowedException( name +" is not allowed in " + weather.toString());

        return
                orbit.getMegaMiles() / Math.min( speed, orbit.getTrafficSpeed())
                        + craterTime * orbit.getCraters(weather);

    }

    public float getSpeed() {
        return speed;
    }

    public int getCraterTime() {
        return craterTime;
    }
}
