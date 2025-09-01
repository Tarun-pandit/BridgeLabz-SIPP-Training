import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ImageToByteArray {
    public static void main(String[] args) {
        String sourceImage = "source_image.jpg";
        String destImage = "dest_image.jpg";

        try (FileInputStream fis = new FileInputStream(sourceImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read image into byte array output stream
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            // Write byte array back to image file
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(destImage)) {

                byte[] bufferOut = new byte[1024];
                int bytesWritten;
                while ((bytesWritten = bais.read(bufferOut)) != -1) {
                    fos.write(bufferOut, 0, bytesWritten);
                }
            }

            System.out.println("Image converted to byte array and written back successfully.");

            // Optional: Verify if files are identical (simple length check)
            if (imageBytes.length == new FileInputStream(destImage).available()) {
                System.out.println("Verification passed: The new file is identical in size to the original.");
            } else {
                System.out.println("Verification failed: The new file size differs from the original.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
