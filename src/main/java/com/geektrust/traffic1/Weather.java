package com.geektrust.traffic1;

/**
 * Created by kraghunathan on 5/12/18.
 */
public enum Weather {

    SUNNY (0.9f), RAINY(1.2f), WINDY(1f);

    private float multiplier;

    Weather( float multiplier){
        this .multiplier = multiplier;
    }

    float getMultiplier(){
        return multiplier;
    }
}
