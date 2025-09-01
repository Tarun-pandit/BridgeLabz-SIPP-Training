import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingReadWriteTextFile {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Source file may not exist.");
        }
    }
}
