package Day5_StringPractice;

import java.util.Random;

public class StudentGradesScorecard {

    // Method to generate random 2-digit scores for PCM for n students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateTotals(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C+";
            } else if (percentage >= 40) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s\n",
                i+1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // You can change this value or take input from user
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotals(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}
