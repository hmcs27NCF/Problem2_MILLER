//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ManufacturerA a = new ManufacturerA();
        ManufacturerB b = new ManufacturerB();

        Drone sdrone = a.createDrone("Surveillance");
        Drone ddrone = b.createDrone("Delivery");

        System.out.println("\n");
        sdrone.displayDetails();
        System.out.println("\n");
        ddrone.displayDetails();
    }
}