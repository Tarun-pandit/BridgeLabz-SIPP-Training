import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to (C)elsius or (F)ahrenheit? Enter C or F: ");
        String choice = scanner.next().trim().toUpperCase();

        if (choice.equals("C")) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + " Fahrenheit is " + celsius + " Celsius.");
        } else if (choice.equals("F")) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice. Please enter C or F.");
        }
    }

    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
