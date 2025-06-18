package Day5_StringPractice;

import java.util.Scanner;

public class SplitTextShortestLongest {

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

    // Method to find shortest and longest word lengths and return their indices
    public static int[] findShortestLongest(String[][] wordsWithLen) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLen = Integer.parseInt(wordsWithLen[0][1]);
        int longestLen = shortestLen;
        for (int i = 1; i < wordsWithLen.length; i++) {
            int len = Integer.parseInt(wordsWithLen[i][1]);
            if (len < shortestLen) {
                shortestLen = len;
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestLen = len;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        String[] words = splitWords(text);
        String[][] wordsWithLen = wordsWithLengths(words);
        int[] indices = findShortestLongest(wordsWithLen);

        System.out.println("Words and their lengths:");
        for (String[] wl : wordsWithLen) {
            System.out.println(wl[0] + " : " + wl[1]);
        }

        System.out.println("Shortest word: " + wordsWithLen[indices[0]][0] + " (Length: " + wordsWithLen[indices[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLen[indices[1]][0] + " (Length: " + wordsWithLen[indices[1]][1] + ")");

        scanner.close();
    }
}
