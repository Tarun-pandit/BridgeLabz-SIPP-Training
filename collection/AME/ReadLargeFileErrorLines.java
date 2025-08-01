import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFileErrorLines {
    public static void main(String[] args) {
        String filename = "largefile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
