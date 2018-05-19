package com.geektrust.traffic1;

import com.geektrust.traffic1.exception.VehicleNotAllowedException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * v1.Orbit Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/09/2018</pre>
 */
public class SolutionTest extends TestCase {

    Vehicle car;
    Vehicle bike ;
    Vehicle tuktuk ;

    Orbit orbit1 ;
    Orbit orbit2 ;

    Vehicle[] vehicles;
    Orbit[] orbits  ;

    Weather weather;

    public SolutionTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
        car     = new Vehicle();
        bike    = new Vehicle();
        tuktuk  = new Vehicle();

        orbit1  = new Orbit( "Orbit1", 18, 20);
        orbit2  = new Orbit( "Orbit2", 20, 10);

        vehicles = new Vehicle[]{ car, bike, tuktuk};
        orbits   = new Orbit[]{orbit1, orbit2};

        weather = Weather.valueOf("SUNNY");

    }

    public void tearDown() throws Exception {
        super.tearDown();
    }


    public void testCase1() throws Exception {

        orbit1.setTrafficSpeed(12);
        orbit2.setTrafficSpeed(10);

        Weather sunny = Weather.valueOf("SUNNY");
        try {
            float time1 = car.timeTaken( orbit1, sunny);
            assertEquals( 144f, time1);

            time1 = car.timeTaken(orbit2, sunny);
            assertEquals( 147f, time1);

            time1 = bike.timeTaken(orbit1, sunny);
            assertEquals( 144f, time1);

            time1 = bike.timeTaken(orbit2, sunny);
            assertEquals( 138f, time1);

            time1 = tuktuk.timeTaken(orbit1, sunny);
            assertEquals( 108f, time1);

            time1 = tuktuk.timeTaken(orbit2, sunny);
            assertEquals(129f, time1);
        } catch (VehicleNotAllowedException e) {
            e.printStackTrace();
            assert false;
        }


    }

    public void testCase2() throws Exception {

        orbit1.setTrafficSpeed(14);
        orbit2.setTrafficSpeed(20);

        Weather windy = Weather.valueOf("WINDY");
        try {
            float time1 = car.timeTaken( orbit1, windy);
            assertEquals( 137.14285f, time1);

            time1 = car.timeTaken(orbit2, windy);
            assertEquals( 90f, time1);

            time1 = bike.timeTaken(orbit1, windy);
            assertEquals( 148f, time1);

            time1 = bike.timeTaken(orbit2, windy);
            assertEquals( 140f, time1);
        }
        catch (VehicleNotAllowedException e) {
            e.printStackTrace();
            assert false;
        }
        try {

            float time1 = tuktuk.timeTaken(orbit1, windy);
            assert false;
        }
        catch (VehicleNotAllowedException e) {
            System.out.println( e.getMessage());
            assert true;
        }
        try {

            float time1 = tuktuk.timeTaken(orbit2, windy);
            assert false;
        }
        catch (VehicleNotAllowedException e) {
            System.out.println(e.getMessage());
            assert true;
        }


    }


    public void testSolution() {

        float minTime = Float.MAX_VALUE;

        Orbit minOrbit = null;
        Vehicle minVehicle = null;

        for( Vehicle vehicle: vehicles) {

            if( ! vehicle.allowed(weather))
                continue;

            for( Orbit orbit : orbits) {

                try {
                    float time = vehicle.timeTaken( orbit, weather);

                    if (time < minTime) {
                        minTime = time;
                        minOrbit = orbit;
                        minVehicle = vehicle;
                    }
                }
                catch (VehicleNotAllowedException e) {
                    System.out.println( e.getMessage());
                }
            }
        }
    }

    public static Test suite() {
        return new TestSuite(OrbitTest.class);
    }
} 
