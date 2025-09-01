import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UppercaseToLowercaseFile {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            int c;
            while ((c = br.read()) != -1) {
                char ch = (char) c;
                bw.write(Character.toLowerCase(ch));
            }
            System.out.println("File converted to lowercase and written to " + destFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
