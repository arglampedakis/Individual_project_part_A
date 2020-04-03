package agindividualproject.school;

import java.time.LocalDate;

/**
 * @author Argiris Glampedakis
 */
public class Student {

    private String studentFirstName;
    private String studentLastName;
    private LocalDate dateOfBirth;
    private float tuitionFees;
    private final CoursesPerStudent coursesPerStudent;

    public Student() {
        this.coursesPerStudent = new CoursesPerStudent();
    }

    public Student(String studentFirstName, String studentLastName, LocalDate dateOfBirth, float tuitionFees) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.coursesPerStudent = new CoursesPerStudent();
    }

    public CoursesPerStudent getCoursesPerStudent() {
        return coursesPerStudent;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "First Name: " + studentFirstName + ", Last Name: " + studentLastName + ", Date of Birth: " + dateOfBirth + ", Tuition Fees: " + tuitionFees;
    }

}
