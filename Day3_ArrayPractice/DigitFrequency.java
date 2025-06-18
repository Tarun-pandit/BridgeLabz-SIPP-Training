import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberStr = scanner.next();

        int[] frequency = new int[10];

        for (int i = 0; i < numberStr.length(); i++) {
            char ch = numberStr.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                frequency[digit]++;
            }
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}
