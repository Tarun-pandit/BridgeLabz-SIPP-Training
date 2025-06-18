import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input third number
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}