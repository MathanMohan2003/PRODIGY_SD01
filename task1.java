
//TEMPERATURE CONVERSION 
package prodigy;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin):");
        String originalUnit = scanner.next();

        // Convert temperature to Celsius for uniform conversion
        switch (originalUnit.toLowerCase()) {
            case "celsius":
                break;
            case "fahrenheit":
                temperature = (temperature - 32) * 5 / 9;
                break;
            case "kelvin":
                temperature -= 273.15;
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        // Convert Celsius temperature to Fahrenheit and Kelvin
        double celsius = temperature;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Display converted temperatures
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);

        scanner.close();
    }
}


