import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        String age = "";
        String language = "";

        try {
            System.out.print("Enter your name: ");
            name = reader.readLine();

            System.out.print("Enter your age: ");
            age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            language = reader.readLine();

            try (FileWriter writer = new FileWriter("user_info.txt")) {
                writer.write("Name: " + name + System.lineSeparator());
                writer.write("Age: " + age + System.lineSeparator());
                writer.write("Favorite Programming Language: " + language + System.lineSeparator());
            }

            System.out.println("User information saved to user_info.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
