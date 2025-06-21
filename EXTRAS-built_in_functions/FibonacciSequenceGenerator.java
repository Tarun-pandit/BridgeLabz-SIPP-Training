import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        int terms = takeInput();
        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        printFibonacciSequence(terms);
    }

    private static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        return scanner.nextInt();
    }

    private static void printFibonacciSequence(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + (i < terms ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
