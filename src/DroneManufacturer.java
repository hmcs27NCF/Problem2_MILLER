/**
 * Abstract Factory that creates the drone manufacturers.
 *
 * @author Hudson Miller
 */
public interface DroneManufacturer {
    Drone createDrone(String type);
}
