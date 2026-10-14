/**
 * Implements the Drone interface.
 *
 * @author Hudson Miller
 */
public class AgriculturalDrone extends Drone {
    public AgriculturalDrone(int b, double r) {
        super(b, r);
        setFeature("Capable of fertilizing fields");
    }
}
