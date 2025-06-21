import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int number = takeInput();
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate factorial: ");
        return scanner.nextInt();
    }

    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
