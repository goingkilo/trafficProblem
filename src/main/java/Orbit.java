/**
 * Created by kraghunathan on 5/9/18.
 */
public class Orbit {

    private float megaMiles;
    private int numCraters;

    public Orbit() {
    }

    public Orbit(float megaMiles, int numCraters) {
        this.megaMiles = megaMiles;
        this.numCraters = numCraters;
    }

    public float getMegaMiles() {
        return megaMiles;
    }

    public int getNumCraters() {
        return numCraters;
    }

    public float getTime( Vehicle vehicle, Weather weather) {
        return -1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orbit orbit = (Orbit) o;

        if (Float.compare(orbit.megaMiles, megaMiles) != 0) return false;
        return numCraters == orbit.numCraters;

    }

    @Override
    public int hashCode() {
        int result = (megaMiles != +0.0f ? Float.floatToIntBits(megaMiles) : 0);
        result = 31 * result + numCraters;
        return result;
    }

    @Override
    public String toString() {
        return "Orbit{" +
                "megaMiles=" + megaMiles +
                ", numCraters=" + numCraters +
                '}';
    }
}
