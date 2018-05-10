/**
 * Created by kraghunathan on 5/9/18.
 */
public class Vehicle {
    private float speed;
    private float craterTime;


    public Vehicle( float speed, float craterTime ) throws Exception {

        if( speed < 0)
            throw new Exception("Speed cannot be negative");

        if( craterTime < 0)
            throw new Exception("CraterTime cannot be negative");

        this.craterTime = craterTime;
        this.speed = speed;
    }

    public float getCraterTime() {
        return craterTime;
    }

    public float getSpeed() {
        return speed;
    }

    public float getTime( Orbit orbit, Weather weather, float trafficSpeed) {
        float speed =  getSpeed() <= trafficSpeed ? getSpeed() : trafficSpeed ;
        return speed * orbit.getMegaMiles() + getCraterTime() * orbit.getNumCraters()  ;

    }
}
