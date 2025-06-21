package Day5_StringPractice;

import java.util.Scanner;

public class VowelsConsonantsCharacterType {

    // Method to check character type
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // convert to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants and return 2D array
    public static String[][] findCharTypes(String text) {
        int len = text.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = charType(ch);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = scanner.nextLine();

        String[][] charTypes = findCharTypes(input);
        displayTable(charTypes);

        scanner.close();
    }
}
