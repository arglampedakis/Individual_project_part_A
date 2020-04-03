package agindividualproject.school;

import java.util.ArrayList;

/**
 * @author Argiris Glampedakis
 */
public class StudentsPerCourse {

    private final ArrayList<Student> studentsList;

    public StudentsPerCourse() {
        studentsList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void showStudentsOfCourse() {
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println((i + 1) + ". " + studentsList.get(i));
        }
    }

    public void addStudentToCourse(Student student) {
        this.studentsList.add(student);
    }
}
