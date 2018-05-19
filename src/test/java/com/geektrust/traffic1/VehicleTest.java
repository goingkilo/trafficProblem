package com.geektrust.traffic1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * v1.Vehicle Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 10, 2018</pre>
 */
public class VehicleTest extends TestCase {

    Orbit orbit ;
    Vehicle car;


    public void setUp() throws Exception {
        super.setUp();
        orbit = new Orbit( "A",1,1);
        orbit.setTrafficSpeed(1);
        car = new Vehicle( "Car", 20,3, Arrays.asList(new Weather[]{

        }));
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    public void testGetSpeed() throws Exception {

        assertEquals( 20f, car.getSpeed() );
    }

    public void testGetCraterTime() throws Exception {

        assertEquals( 3f, car.getCraterTime() );
    }

    public void testVehicleNotAllowedWeather() throws Exception {

         try {
             new Vehicle("Bike", 0,0, null).timeTaken( new Orbit("",0,0), Weather.RAINY ) ;
             assert false;
         }
         catch(Exception e) {
             assertEquals( "Bike is not allowed in RAINY", e.getMessage());
             assert true;
         }
    }

    @Test
    public void testGetTime() throws Exception {
        assertEquals( true, car.timeTaken(orbit, Weather.RAINY) >= 0 );
    }

    public void testGetTimeWithTraffic() throws Exception {
        float time = car.timeTaken( orbit, Weather.WINDY);
        assertEquals( 63.0f, time );

    }



} 
