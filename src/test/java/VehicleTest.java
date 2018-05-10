import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Vehicle Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 10, 2018</pre>
 */
public class VehicleTest extends TestCase {

    Orbit orbit ;
    Vehicle vehicle;


    public void setUp() throws Exception {
        super.setUp();
        orbit = new Orbit(1,1);
        vehicle = new Vehicle( 2,1);
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    public void testGetSpeed() throws Exception {

        assertEquals( 2f, vehicle.getSpeed() );

        try {
            Vehicle negativeSpeed = new Vehicle(-2, 1);
            assert false;
        }
        catch(Exception e) {
            assertEquals( "Speed cannot be negative", e.getMessage());
        }
    }

    public void testGetCraterTime() throws Exception {

        assertEquals( 1f, vehicle.getCraterTime() );

        try {
            Vehicle negativeCraterTime = new Vehicle( 2, -11);
            assert false;
        }
        catch(Exception e) {
            assertEquals( "CraterTime cannot be negative", e.getMessage());
        }
    }

    public void testVehicleNotAllowedWeather() throws Exception {

         try {
             vehicle.getTime( orbit, Weather.RAINY, 1f ) ;
             assert false;
         }
         catch(Exception e) {
             assert true;
         }
    }

    @Test
    public void testGetTime() throws Exception {
        assertEquals( true, vehicle.getTime(orbit, Weather.RAINY, 1) >= 0 );
        assertEquals( true, vehicle.getTime(orbit, Weather.RAINY, 1) >= 0 );
    }

    public void testGetTimeWithTraffic() throws Exception {
        float time = vehicle.getTime( orbit, Weather.RAINY, 1);
        assertEquals( 2.0f, time );

    }



} 
