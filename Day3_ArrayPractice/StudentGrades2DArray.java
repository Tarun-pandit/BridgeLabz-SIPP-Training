import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark < 0) {
                    System.out.println("Please enter positive marks.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            double percentage = percentages[i];
            if (percentage >= 90) {
                grades[i] = 'A';
            } else if (percentage >= 80) {
                grades[i] = 'B';
            } else if (percentage >= 70) {
                grades[i] = 'C';
            } else if (percentage >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f%%, Grade=%c%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
