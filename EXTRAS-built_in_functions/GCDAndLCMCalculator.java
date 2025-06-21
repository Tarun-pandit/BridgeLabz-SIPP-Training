import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);

        System.out.println("GCD of " + numbers[0] + " and " + numbers[1] + " is: " + gcd);
        System.out.println("LCM of " + numbers[0] + " and " + numbers[1] + " is: " + lcm);
    }

    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.println("Enter two integers:");
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        return nums;
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int calculateLCM(int a, int b, int gcd) {
        return (a / gcd) * b;
    }
}
