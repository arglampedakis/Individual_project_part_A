package agindividualproject.school;

import java.time.LocalDate;

/**
 * @author Argiris Glampedakis
 */
public class Course {

    private String courseTitle;
    private String courseType;
    private LocalDate courseStartDate;
    private LocalDate courseEndDate;
    private String courseStream;
    private StudentsPerCourse studentsPerCourse;
    private TrainersPerCourse trainersPerCourse;
    private AssignmentsPerCourse assignmentsPerCourse;

    public Course() {
        this.studentsPerCourse = new StudentsPerCourse();
        this.trainersPerCourse = new TrainersPerCourse();
        this.assignmentsPerCourse = new AssignmentsPerCourse();
    }

    public Course(String courseTitle, String courseType, LocalDate courseStartDate, LocalDate courseEndDate, String courseStream) {
        this.courseTitle = courseTitle;
        this.courseType = courseType;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.courseStream = courseStream;
        this.studentsPerCourse = new StudentsPerCourse();
        this.trainersPerCourse = new TrainersPerCourse();
        this.assignmentsPerCourse = new AssignmentsPerCourse();

    }

    public TrainersPerCourse getTrainersPerCourse() {
        return trainersPerCourse;
    }

    public void setTrainersPerCourse(TrainersPerCourse trainersPerCourse) {
        this.trainersPerCourse = trainersPerCourse;
    }

    public AssignmentsPerCourse getAssignmentsPerCourse() {
        return assignmentsPerCourse;
    }

    public void setAssignmentsPerCourse(AssignmentsPerCourse assignmentsPerCourse) {
        this.assignmentsPerCourse = assignmentsPerCourse;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType + " Time";
    }

    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public LocalDate getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(LocalDate courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    public String getCourseStream() {
        return courseStream;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }

    public StudentsPerCourse getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public void setStudentsPerCourse(StudentsPerCourse studentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
    }

    @Override
    public String toString() {
        return "Title: " + courseTitle + ", Type: " + courseType + ", Start Date: " + courseStartDate + ", End Date: " + courseEndDate + ", Stream: " + courseStream;
    }
}
