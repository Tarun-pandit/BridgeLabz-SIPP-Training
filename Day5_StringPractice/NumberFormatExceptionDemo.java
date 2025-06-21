package Day5_StringPractice;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    // Method to demonstrate NumberFormatException with try-catch
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse as integer: ");
        String input = scanner.nextLine();

        // Uncomment to generate exception (program will stop)
        // generateException(input);

        System.out.println("Demonstrating NumberFormatException handling:");
        handleException(input);

        scanner.close();
    }
}
