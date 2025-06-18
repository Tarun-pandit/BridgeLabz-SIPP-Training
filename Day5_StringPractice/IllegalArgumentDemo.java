package Day5_StringPractice;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // start index greater than end index to generate exception
        System.out.println(text.substring(5, 2));
    }

    // Method to demonstrate IllegalArgumentException with try-catch
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Uncomment to generate exception (program will stop)
        // generateException(text);

        System.out.println("Demonstrating IllegalArgumentException handling:");
        handleException(text);

        scanner.close();
    }
}
