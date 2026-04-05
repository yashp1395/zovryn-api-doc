import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double result = (temp * 9/5) + 32;
            System.out.println("Result: " + result + " °F");
        } else if (choice == 2) {
            double result = (temp - 32) * 5/9;
            System.out.println("Result: " + result + " °C");
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}