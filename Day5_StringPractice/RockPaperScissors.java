package Day5_StringPractice;

import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 1.0/3) {
            return "rock";
        } else if (rand < 2.0/3) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method to find winner between user and computer
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        }
        if (user.equals("rock")) {
            return computer.equals("scissors") ? "user" : "computer";
        } else if (user.equals("paper")) {
            return computer.equals("rock") ? "user" : "computer";
        } else if (user.equals("scissors")) {
            return computer.equals("paper") ? "user" : "computer";
        }
        return "invalid";
    }

    // Method to calculate average and percentage wins
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        double drawPercent = (draws * 100.0) / totalGames;

        String[][] stats = {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)}
        };
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        System.out.println("\nSummary:");
        System.out.println("Result\tCount\tPercentage");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] results = new String[n][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock, paper, scissors) for game " + (i+1) + ": ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("user")) {
                userWins++;
            } else if (winner.equals("computer")) {
                computerWins++;
            } else if (winner.equals("draw")) {
                draws++;
            }

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        displayResults(results, stats);

        scanner.close();
    }
}
