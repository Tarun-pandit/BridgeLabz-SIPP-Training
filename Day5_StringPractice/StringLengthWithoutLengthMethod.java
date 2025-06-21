package Day5_StringPractice;

import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length of string without using length()
    public static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = stringLength(input);
        int builtInLength = input.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);

        scanner.close();
    }
}
