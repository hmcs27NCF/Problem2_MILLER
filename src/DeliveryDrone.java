/**
 * Implements the Drone interface.
 *
 * @author Hudson Miller
 */
public class DeliveryDrone extends Drone {
    public DeliveryDrone(int b, double r) {
        super(b, r);
        setFeature("Capable of delivering packages");
    }
}
