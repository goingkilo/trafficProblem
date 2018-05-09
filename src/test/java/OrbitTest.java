import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Orbit Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/09/2018</pre>
 */
public class OrbitTest extends TestCase {

    Orbit orbit ;
    Vehicle vehicle;

    public OrbitTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
        orbit = new Orbit(1,1);
        vehicle = new Vehicle( 2,1);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetTime() throws Exception {
        assertEquals( true, orbit.getMegaMiles() >= 0 );
        assertEquals( true, orbit.getNumCraters() >= 0 );
        assertEquals( true, orbit.getTime(vehicle, Weather.RAINY, 1) >= 0 );
        assertEquals( true, orbit.getTime(vehicle, Weather.RAINY, 1) >= 0 );
    }


    public void testTrafficSpeedPrevails() throws Exception {
        float time = orbit.getTime(vehicle, Weather.RAINY, 1);
        assertEquals( 2.0f, time );

    }



    public static Test suite() {
        return new TestSuite(OrbitTest.class);
    }
} 
