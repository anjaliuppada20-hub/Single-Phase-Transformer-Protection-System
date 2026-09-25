import java.util.Scanner;

public class TransformerProtection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter Current (A): ");
        double current = sc.nextDouble();

        System.out.print("Enter Temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.println("\n--- Single-Phase Transformer Protection ---");

        boolean trip = false;

        // Voltage protection
        if (voltage < 210) {
            System.out.println("UNDER-VOLTAGE detected!");
            trip = true;
        }
        else if (voltage > 250) {
            System.out.println("OVER-VOLTAGE detected!");
            trip = true;
        }
        else {
            System.out.println("Voltage: NORMAL");
        }

        // Over-current protection
        if (current > 10) {
            System.out.println("OVER-CURRENT detected!");
            trip = true;
        }
        else {
            System.out.println("Current: NORMAL");
        }

        // Temperature protection
        if (temperature > 90) {
            System.out.println("OVER-TEMPERATURE detected!");
            trip = true;
        }
        else {
            System.out.println("Temperature: NORMAL");
        }

        // Final protection decision
        System.out.println();

        if (trip) {
            System.out.println("TRANSFORMER STATUS: TRIP");
            System.out.println("Protection Relay: ON");
            System.out.println("Load: DISCONNECTED");
        }
        else {
            System.out.println("TRANSFORMER STATUS: NORMAL");
            System.out.println("Protection Relay: OFF");
            System.out.println("Load: CONNECTED");
        }

        sc.close();
    }
}
