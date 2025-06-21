package Day5_StringPractice;

import java.util.Scanner;

public class SplitTextCompare {

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

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int len = stringLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = word.toString();
                word = new StringBuilder();
            } else {
                word.append(ch);
            }
        }
        words[wordIndex] = word.toString();
        return words;
    }

    // Method to compare two string arrays and return boolean
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom split words:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("Built-in split words:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean isEqual = compareStringArrays(customSplit, builtInSplit);
        System.out.println("Are both split arrays equal? " + isEqual);

        scanner.close();
    }
}
