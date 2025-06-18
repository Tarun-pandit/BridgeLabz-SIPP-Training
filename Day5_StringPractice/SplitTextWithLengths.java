package Day5_StringPractice;

import java.util.Scanner;

public class SplitTextWithLengths {

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

    // Method to get 2D array of words and their lengths as strings
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] wordsWithLen = wordsWithLengths(words);
        displayTable(wordsWithLen);

        scanner.close();
    }
}
