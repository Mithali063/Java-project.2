import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌡️ Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Choose an option (1-4): ");
        int choice = sc.nextInt();

        double inputTemp, result;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = sc.nextDouble();
                result = celsiusToFahrenheit(inputTemp);
                System.out.println("In Fahrenheit: " + result);
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = sc.nextDouble();
                result = celsiusToKelvin(inputTemp);
                System.out.println("In Kelvin: " + result);
                break;
            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = sc.nextDouble();
                result = fahrenheitToCelsius(inputTemp);
                System.out.println("In Celsius: " + result);
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = sc.nextDouble();
                result = kelvinToCelsius(inputTemp);
                System.out.println("In Celsius: " + result);
                break;
            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}

