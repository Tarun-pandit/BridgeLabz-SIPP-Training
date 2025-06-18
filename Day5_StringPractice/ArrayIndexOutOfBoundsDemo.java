package Day5_StringPractice;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Access index larger than array length to generate exception
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException with try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Call method to generate exception (this will cause program to stop if uncommented)
        // generateException(names);

        // To demonstrate, we will call handleException method instead
        System.out.println("Demonstrating exception handling:");
        handleException(names);

        scanner.close();
    }
}
