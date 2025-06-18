package Day5_StringPractice;

public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        int length = text.length();
        System.out.println("Length of text: " + length);
    }

    // Method to demonstrate NullPointerException with try-catch
    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncommenting the following line will cause program to stop due to exception
        // generateException();

        System.out.println("Demonstrating NullPointerException handling:");
        handleException();
    }
}
