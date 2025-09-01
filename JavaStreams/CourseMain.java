import java.util.List;

/**
 * Main class to demonstrate the Multi-Level University Course Management System using Java Generics.
 */
public class CourseMain {
    public static void main(String[] args) {
        Course<ExamCourse> examCourseManager = new Course<>();
        examCourseManager.addCourse(new ExamCourse("Mathematics"));
        examCourseManager.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourseManager = new Course<>();
        assignmentCourseManager.addCourse(new AssignmentCourse("English Literature"));
        assignmentCourseManager.addCourse(new AssignmentCourse("History"));

        Course<ResearchCourse> researchCourseManager = new Course<>();
        researchCourseManager.addCourse(new ResearchCourse("Computer Science Research"));
        researchCourseManager.addCourse(new ResearchCourse("Biology Research"));

        System.out.println("Exam Courses:");
        Course.displayCourses(examCourseManager.getCourses());

        System.out.println("\nAssignment Courses:");
        Course.displayCourses(assignmentCourseManager.getCourses());

        System.out.println("\nResearch Courses:");
        Course.displayCourses(researchCourseManager.getCourses());
    }
}
