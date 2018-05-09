/**
 * Created by kraghunathan on 5/9/18.
 */
public class Vehicle {
    private float speed;
    private float craterTime;


    public Vehicle( float speed, float craterTime ) {
        this.craterTime = craterTime;
        this.speed = speed;
    }


    public float getCraterTime() {
        return craterTime;
    }

    public void setCraterTime(float craterTime) {
        this.craterTime = craterTime;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
