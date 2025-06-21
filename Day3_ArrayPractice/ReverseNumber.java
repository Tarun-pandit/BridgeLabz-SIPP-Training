import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberStr = scanner.next();

        int length = numberStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }

        System.out.println("Digits in reverse order:");
        for (int i = 0; i < length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
