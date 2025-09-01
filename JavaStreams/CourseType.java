/**
 * Abstract class representing a course type.
 */
public abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String getEvaluationType();

    @Override
    public String toString() {
        return String.format("%s [CourseName=%s]", getEvaluationType(), courseName);
    }
}
