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
        orbit = new Orbit();
        vehicle = new Vehicle();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetTime() throws Exception {
        assertEquals( orbit.getMegaMiles() >= 0 , true);
        assertEquals( orbit.getNumCraters() >= 0 , true);
        assertEquals( orbit.getTime( vehicle, Weather.RAINY) >= 0, true);

    }



    public static Test suite() {
        return new TestSuite(OrbitTest.class);
    }
} 
