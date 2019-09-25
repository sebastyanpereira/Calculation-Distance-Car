import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consumption = new Scanner(System.in);
        System.out.println("Please enter your car fuel consumption, expressed in litres per 100 km: ");
        double fuelConsumption = consumption.nextDouble();
        Scanner amount = new Scanner(System.in);
        System.out.println("Please enter amount of fuel in your car");
        double fuelAmount = consumption.nextDouble();
        int approximateDistance = (int) (fuelAmount / fuelConsumption);
        System.out.println("Distance which your car can go equals " + approximateDistance + " km");
    }
}
