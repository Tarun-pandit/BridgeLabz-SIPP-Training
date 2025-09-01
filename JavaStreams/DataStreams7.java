import java.io.*;

public class DataStreams7 {
    public static void main(String[] args) {
        String filename = "students.dat";

        // Writing data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);

            System.out.println("Student data written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Reading data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (true) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
