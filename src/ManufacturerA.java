/**
 * Implements the DroneManufacturer interface and uses the Factory pattern.
 * Makes drones with a longer battery life and shorter range than B.
 *
 * @author Hudson Miller
 */
public class ManufacturerA implements DroneManufacturer {
    @Override
    public Drone createDrone(String type) {
        if(type.equalsIgnoreCase("surveillance")) {
            return new SurveillanceDrone(1000, 10.0);
        }
        else if(type.equalsIgnoreCase("agricultural")) {
            return new AgriculturalDrone(2000, 5.0);
        }
        else if(type.equalsIgnoreCase("delivery")) {
            return new DeliveryDrone(2000, 20.0);
        }
        else {
            return null;
        }
    }
}
