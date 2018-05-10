/**
 * Created by kraghunathan on 5/9/18.
 */
public class Orbit {

    private float megaMiles;
    private int numCraters;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orbit orbit = (Orbit) o;

        if (Float.compare(orbit.getMegaMiles(), getMegaMiles()) != 0) return false;
        return getNumCraters() == orbit.getNumCraters();

    }

    @Override
    public int hashCode() {
        int result = (getMegaMiles() != +0.0f ? Float.floatToIntBits(getMegaMiles()) : 0);
        result = 31 * result + getNumCraters();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orbit{");
        sb.append("megaMiles=").append(megaMiles);
        sb.append(", numCraters=").append(numCraters);
        sb.append('}');
        return sb.toString();
    }
}
