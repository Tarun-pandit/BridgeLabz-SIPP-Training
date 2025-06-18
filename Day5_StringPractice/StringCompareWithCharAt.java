package Day5_StringPractice;

import java.util.Scanner;

public class StringCompareWithCharAt {

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
        System.out.print("Enter first string: ");
        String s1 = scanner.next();
        System.out.print("Enter second string: ");
        String s2 = scanner.next();

        boolean customCompare = compareStrings(s1, s2);
        boolean builtInCompare = s1.equals(s2);

        System.out.println("Custom comparison result: " + customCompare);
        System.out.println("Built-in equals() result: " + builtInCompare);
        System.out.println("Are both results same? " + (customCompare == builtInCompare));

        scanner.close();
    }
}
