import java.io.*;

public class BufferedStreams2 {
    public static void main(String[] args) {
        String sourceFile = "largefile.dat";
        String destFileBuffered = "copy_buffered.dat";
        String destFileUnbuffered = "copy_unbuffered.dat";

        // Copy using buffered streams
        long startBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFileBuffered))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered copy error: " + e.getMessage());
        }
        long endBuffered = System.nanoTime();

        // Copy using unbuffered streams
        long startUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFileUnbuffered)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered copy error: " + e.getMessage());
        }
        long endUnbuffered = System.nanoTime();

        System.out.println("Buffered copy time (ns): " + (endBuffered - startBuffered));
        System.out.println("Unbuffered copy time (ns): " + (endUnbuffered - startUnbuffered));
    }
}
