/**
 * Implements the DroneManufacturer interface and uses the Factory pattern.
 * Makes drones with more range and less battery than A.
 *
 * @author Hudson Miller
 */
public class ManufacturerB implements DroneManufacturer {
    @Override
    public Drone createDrone(String type) {
        if(type.equalsIgnoreCase("surveillance")) {
            return new SurveillanceDrone(750, 12.5);
        }
        else if(type.equalsIgnoreCase("agricultural")) {
            return new AgriculturalDrone(1500, 7.5);
        }
        else if(type.equalsIgnoreCase("delivery")) {
            return new DeliveryDrone(1750, 25.0);
        }
        else {
            return null;
        }
    }
}
