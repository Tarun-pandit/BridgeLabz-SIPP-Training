package Day5_StringPractice;

import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt
    public static String substringCustom(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt
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
        System.out.print("Enter the string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String customSub = substringCustom(input, start, end);
        String builtInSub = "";
        try {
            builtInSub = input.substring(start, end);
        } catch (Exception e) {
            System.out.println("Exception in built-in substring: " + e.getMessage());
        }

        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);

        boolean isEqual = compareStrings(customSub, builtInSub);
        System.out.println("Are both substrings equal? " + isEqual);

        scanner.close();
    }
}
