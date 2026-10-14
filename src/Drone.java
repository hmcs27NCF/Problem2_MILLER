/**
 * Basic drone abstract class. Inherited by Surveillance, Agricultural and DeliveryDrone.
 *
 * @author Hudson Miller
 */
public abstract class Drone {

    private int battery;
    private double range;
    // Each drone subclass will define its own feature, but must have one nonetheless
    private String feature;

    public Drone(int battery, double range) {
        this.battery = battery;
        this.range = range;
    }

    // Getters and Setters
    public int getBattery() {
        return battery;
    }
    public double getRange() {
        return range;
    }
    public String getFeature() {
        return feature;
    }
    public void setFeature(String f) {
        feature = f;
    }

    /**
     * Prints out all of the drone's details.
     */
    public void displayDetails() {
        System.out.printf("Battery: %s\nRange: %s\nSpecial Feature: %s", battery, range, getFeature());
    }
}
