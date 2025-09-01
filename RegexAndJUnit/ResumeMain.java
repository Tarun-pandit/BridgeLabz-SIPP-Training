import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate the AI-Driven Resume Screening System using Java Generics.
 */
public class ResumeMain {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Alice"));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Bob"));

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Charlie"));
        dataScientistResumes.addResume(new DataScientist("Diana"));

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Eve"));
        productManagerResumes.addResume(new ProductManager("Frank"));

        System.out.println("Processing Software Engineer Resumes:");
        Resume.processResumes(softwareEngineerResumes.getResumes());

        System.out.println("\nProcessing Data Scientist Resumes:");
        Resume.processResumes(dataScientistResumes.getResumes());

        System.out.println("\nProcessing Product Manager Resumes:");
        Resume.processResumes(productManagerResumes.getResumes());
    }
}
