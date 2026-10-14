/**
 * Implements the Drone interface.
 *
 * @author Hudson Miller
 */
public class SurveillanceDrone extends Drone {
    public SurveillanceDrone(int b, double r) {
        super(b, r);
        setFeature("Radar-proof");
    }
}
