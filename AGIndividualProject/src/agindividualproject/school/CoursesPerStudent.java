package agindividualproject.school;

import java.util.ArrayList;

/**
 * @author Argiris Glampedakis
 */
public class CoursesPerStudent {

    private final ArrayList<Course> coursesOfStudent;

    public CoursesPerStudent() {
        this.coursesOfStudent = new ArrayList<>();
    }

    public ArrayList<Course> getCoursesOfStudent() {
        return coursesOfStudent;
    }

    public void showCoursesOfStudent() {
        for (int i = 0; i < coursesOfStudent.size(); i++) {
            System.out.println((i + 1) + ". " + coursesOfStudent.get(i));
        }
    }

    public void showAssignmentOfStudent() {
        ArrayList<Assignment> tempList = getAllAssignmentsOfStudent();
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println((i + 1) + ". " + tempList.get(i));
        }

    }

    public void addCourseToStudent(Course course) {
        this.coursesOfStudent.add(course);
    }

    public ArrayList getAllAssignmentsOfStudent() {
        ArrayList<Assignment> allAssignmentsOfStudentList = new ArrayList<>();
        for (int i = 0; i < coursesOfStudent.size(); i++) {
            Course tempCourse = coursesOfStudent.get(i);
            ArrayList<Assignment> tempList = tempCourse.getAssignmentsPerCourse().getAssignmentsList();
            for (int j = 0; j < tempList.size(); j++) {
                Assignment tempAssignment = tempList.get(j);
                allAssignmentsOfStudentList.add(tempAssignment);
            }
        }
        return allAssignmentsOfStudentList;
    }
}
