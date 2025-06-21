package Day5_StringPractice;

import java.util.Scanner;

public class LowercaseConversion {

    // Method to convert string to lowercase using charAt and ASCII logic
    public static String toLowercaseCustom(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt and return boolean
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = scanner.nextLine();

        String lowerCustom = toLowercaseCustom(input);
        String lowerBuiltIn = input.toLowerCase();

        System.out.println("Custom lowercase conversion: " + lowerCustom);
        System.out.println("Built-in lowercase conversion: " + lowerBuiltIn);

        boolean isEqual = compareStrings(lowerCustom, lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + isEqual);

        scanner.close();
    }
}
