import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "largefile_source.dat";
        String destFileBuffered = "largefile_buffered_copy.dat";
        String destFileUnbuffered = "largefile_unbuffered_copy.dat";

        try {
            long startTime = System.nanoTime();
            copyFileUnbuffered(sourceFile, destFileUnbuffered);
            long unbufferedTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            copyFileBuffered(sourceFile, destFileBuffered);
            long bufferedTime = System.nanoTime() - startTime;

            System.out.println("Unbuffered copy time (ns): " + unbufferedTime);
            System.out.println("Buffered copy time (ns): " + bufferedTime);
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }

    private static void copyFileUnbuffered(String source, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void copyFileBuffered(String source, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source), BUFFER_SIZE);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest), BUFFER_SIZE)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}
