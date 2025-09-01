import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamStudentDetails {
    public static void main(String[] args) {
        String filename = "studentdata.dat";

        // Sample student data
        int rollNumber = 101;
        String name = "John Doe";
        double gpa = 3.75;

        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int rNo = dis.readInt();
            String studentName = dis.readUTF();
            double studentGpa = dis.readDouble();

            System.out.println("Read Student Data:");
            System.out.println("Roll Number: " + rNo);
            System.out.println("Name: " + studentName);
            System.out.println("GPA: " + studentGpa);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
