import java.util.ArrayList;
import java.util.List;

/**
 * Generic Course class to manage different courses.
 * @param <T> Type parameter extending CourseType.
 */
public class Course<T extends CourseType> {
    private List<T> courses;

    public Course() {
        courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    /**
     * Display all courses using wildcard to handle any subtype of CourseType.
     */
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
