import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        do {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        } while (!feedback.equals("correct"));

        System.out.println("Yay! The computer guessed your number: " + guess);
    }

    private static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
}
