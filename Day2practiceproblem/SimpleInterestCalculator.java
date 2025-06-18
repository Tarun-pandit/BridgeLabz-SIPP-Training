import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter Rate of interest: ");
        double rate = scanner.nextDouble();

        // Input time in years
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}