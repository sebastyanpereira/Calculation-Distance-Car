import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your car fuel consumption, expressed in litres per 100 km: ");
        double fuelConsumption = keyboard.nextDouble();
        System.out.println("Please enter amount of fuel in your car");
        double fuelAmount = keyboard.nextDouble();
        int approximateDistance = (int) (fuelAmount / fuelConsumption);
        System.out.println("Distance which your car can go equals " + approximateDistance + " km");
    }
}
