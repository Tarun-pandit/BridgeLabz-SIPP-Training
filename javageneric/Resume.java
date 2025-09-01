import java.util.ArrayList;
import java.util.List;

/**
 * Generic Resume class to process resumes dynamically.
 * @param <T> Type parameter extending JobRole.
 */
public class Resume<T extends JobRole> {
    private List<T> resumes;

    public Resume() {
        resumes = new ArrayList<>();
    }

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }

    /**
     * Process resumes in the screening pipeline using wildcard to handle multiple job roles.
     */
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing resume: " + resume);
        }
    }
}
