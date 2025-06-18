import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int p = scanner.nextInt();
            if (p < 0) {
                System.out.println("Please enter positive marks.");
                i--;
                continue;
            }
            physics[i] = p;

            System.out.print("Chemistry: ");
            int c = scanner.nextInt();
            if (c < 0) {
                System.out.println("Please enter positive marks.");
                i--;
                continue;
            }
            chemistry[i] = c;

            System.out.print("Maths: ");
            int m = scanner.nextInt();
            if (m < 0) {
                System.out.println("Please enter positive marks.");
                i--;
                continue;
            }
            maths[i] = m;

            int total = physics[i] + chemistry[i] + maths[i];
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
                    i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
