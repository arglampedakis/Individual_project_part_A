package agindividualproject.tools;

import agindividualproject.school.*;
import static agindividualproject.tools.Creations.*;
import java.time.LocalDate;

/**
 * @author Argiris Glampedakis
 */
public class SyntheticData {

    public static void automaticInput() {
        //1st course
        Course course1 = new Course("CB08", "Full Time", LocalDate.of(2019, 9, 18), LocalDate.of(2020, 01, 07), "Java");
        allCoursesList.add(course1);
        //assignemnts of 1st course
        Assignment assignment1OfCourse1 = new Assignment("IndividualProject08", LocalDate.of(2019, 11, 14), "School Program with Students, Assgnments, Trainers and Courses", 20.0f, 100.0f);
        allAssignmentsList.add(assignment1OfCourse1);
        course1.getAssignmentsPerCourse().addAssignmentToCourse(assignment1OfCourse1);
        Assignment assignment2OfCourse1 = new Assignment("TeamProject08", LocalDate.of(2019, 12, 20), "Create an e-Shop", 35.0f, 120.0f);
        allAssignmentsList.add(assignment2OfCourse1);
        course1.getAssignmentsPerCourse().addAssignmentToCourse(assignment2OfCourse1);

        //2nd course
        Course course2 = new Course("CB09", "Full Time", LocalDate.of(2019, 11, 17), LocalDate.of(2020, 03, 10), "C#");
        allCoursesList.add(course2);
        //assignments of 2nd course
        Assignment assignment1OfCourse2 = new Assignment("IndividualProject09", LocalDate.of(2020, 01, 17), "School Program with Students, Assgnments, Trainers and Courses", 20.0f, 100.0f);
        allAssignmentsList.add(assignment1OfCourse2);
        course2.getAssignmentsPerCourse().addAssignmentToCourse(assignment1OfCourse2);
        Assignment assignment2OfCourse2 = new Assignment("TeamProject09", LocalDate.of(2020, 02, 14), "Create an Online Shop", 35.0f, 120.0f);
        allAssignmentsList.add(assignment2OfCourse2);
        course2.getAssignmentsPerCourse().addAssignmentToCourse(assignment2OfCourse2);

        //3rd course
        Course course3 = new Course("CB10", "Part Time", LocalDate.of(2020, 02, 15), LocalDate.of(2020, 9, 18), "Java");
        allCoursesList.add(course3);
        //assignments of 3rd course
        Assignment assignment1OfCourse3 = new Assignment("IndividualProject08", LocalDate.of(2020, 04, 01), "School Program with Students, Assgnments, Trainers and Courses", 20.0f, 100.0f);
        allAssignmentsList.add(assignment1OfCourse3);
        course3.getAssignmentsPerCourse().addAssignmentToCourse(assignment1OfCourse3);
        Assignment assignment2OfCourse3 = new Assignment("TeamProject09", LocalDate.of(2020, 9, 01), "Create an Online Shop", 35.0f, 120.0f);
        allAssignmentsList.add(assignment2OfCourse3);
        course3.getAssignmentsPerCourse().addAssignmentToCourse(assignment2OfCourse3);

        //Trainers and their courses
        Trainer trainer1 = new Trainer("George", "Iraklidis", "Java");
        allTrainersList.add(trainer1);
        course1.getTrainersPerCourse().addTrainerToCourse(trainer1);
        course3.getTrainersPerCourse().addTrainerToCourse(trainer1);

        Trainer trainer2 = new Trainer("George", "Pasparakis", "C#");
        allTrainersList.add(trainer2);
        course2.getTrainersPerCourse().addTrainerToCourse(trainer2);

        Trainer trainer3 = new Trainer("Nick", "Karapas", "JavaScript");
        allTrainersList.add(trainer3);
        course1.getTrainersPerCourse().addTrainerToCourse(trainer3);
        course2.getTrainersPerCourse().addTrainerToCourse(trainer3);
        course3.getTrainersPerCourse().addTrainerToCourse(trainer3);

        Trainer trainer4 = new Trainer("George", "Lelakis", "Html");
        allTrainersList.add(trainer4);
        course1.getTrainersPerCourse().addTrainerToCourse(trainer4);
        course2.getTrainersPerCourse().addTrainerToCourse(trainer4);

        Trainer trainer5 = new Trainer("John", "Papadakis", "php");
        allTrainersList.add(trainer5);
        course2.getTrainersPerCourse().addTrainerToCourse(trainer5);
        course3.getTrainersPerCourse().addTrainerToCourse(trainer5);

        Trainer trainer7 = new Trainer("Mary", "Mavrikaki", "python");
        allTrainersList.add(trainer7);
        course1.getTrainersPerCourse().addTrainerToCourse(trainer7);
        course3.getTrainersPerCourse().addTrainerToCourse(trainer7);

        //students of 1st course
        Student student1 = new Student("Nikos", "Sfiridakis", LocalDate.of(1989, 11, 19), 1500.00f);
        allStudentsList.add(student1);
        course1.getStudentsPerCourse().addStudentToCourse(student1);
        student1.getCoursesPerStudent().addCourseToStudent(course1);

        Student student2 = new Student("Argiris", "Glampedakis", LocalDate.of(1990, 01, 12), 1200.00f);
        allStudentsList.add(student2);
        course1.getStudentsPerCourse().addStudentToCourse(student2);
        student2.getCoursesPerStudent().addCourseToStudent(course1);

        Student student3 = new Student("Dimitris", "Smirlis", LocalDate.of(1990, 12, 22), 1700.00f);
        allStudentsList.add(student3);
        course1.getStudentsPerCourse().addStudentToCourse(student3);
        student3.getCoursesPerStudent().addCourseToStudent(course1);

        Student student4 = new Student("Kostas", "Rompakis", LocalDate.of(1991, 02, 11), 700.00f);
        allStudentsList.add(student4);
        course1.getStudentsPerCourse().addStudentToCourse(student4);
        student4.getCoursesPerStudent().addCourseToStudent(course1);

        //students of 2nd course
        Student student5 = new Student("Thanos", "Samaras", LocalDate.of(1992, 04, 19), 1000.00f);
        allStudentsList.add(student5);
        course2.getStudentsPerCourse().addStudentToCourse(student5);
        student5.getCoursesPerStudent().addCourseToStudent(course2);

        Student student6 = new Student("Dimitris", "Vergoulidis", LocalDate.of(1990, 9, 15), 350.00f);
        allStudentsList.add(student6);
        course2.getStudentsPerCourse().addStudentToCourse(student6);
        student6.getCoursesPerStudent().addCourseToStudent(course2);

        Student student7 = new Student("Akis", "Mavrommatis", LocalDate.of(1988, 05, 03), 2300.00f);
        allStudentsList.add(student7);
        course2.getStudentsPerCourse().addStudentToCourse(student7);
        student7.getCoursesPerStudent().addCourseToStudent(course2);

        Student student8 = new Student("Maria", "Santamouri", LocalDate.of(1989, 06, 29), 500.00f);
        allStudentsList.add(student8);
        course2.getStudentsPerCourse().addStudentToCourse(student8);
        student8.getCoursesPerStudent().addCourseToStudent(course2);

        //students of 3rd course
        Student student9 = new Student("Eirini", "Fragkoulaki", LocalDate.of(1992, 10, 13), 1600.00f);
        allStudentsList.add(student9);
        course3.getStudentsPerCourse().addStudentToCourse(student9);
        student9.getCoursesPerStudent().addCourseToStudent(course3);

        Student student10 = new Student("Eleftheria", "Apostolaki", LocalDate.of(1993, 9, 8), 1900.00f);
        allStudentsList.add(student10);
        course3.getStudentsPerCourse().addStudentToCourse(student10);
        student10.getCoursesPerStudent().addCourseToStudent(course3);

        Student student11 = new Student("Eytyxia", "Koufaki", LocalDate.of(1995, 03, 30), 240.00f);
        allStudentsList.add(student11);
        course3.getStudentsPerCourse().addStudentToCourse(student11);
        student11.getCoursesPerStudent().addCourseToStudent(course3);

        Student student12 = new Student("Eleni", "Kapetanou", LocalDate.of(1994, 05, 21), 870.00f);
        allStudentsList.add(student12);
        course3.getStudentsPerCourse().addStudentToCourse(student12);
        student12.getCoursesPerStudent().addCourseToStudent(course3);

        //students with more than 1 courses
        Student student13 = new Student("Dimitra", "Maragkoudaki", LocalDate.of(1991, 06, 05), 1070.00f);
        allStudentsList.add(student13);
        course3.getStudentsPerCourse().addStudentToCourse(student13);
        student13.getCoursesPerStudent().addCourseToStudent(course3);
        course1.getStudentsPerCourse().addStudentToCourse(student13);
        student13.getCoursesPerStudent().addCourseToStudent(course1);

        Student student14 = new Student("Stelios", "Vilanakis", LocalDate.of(1991, 04, 23), 450.00f);
        allStudentsList.add(student14);
        course3.getStudentsPerCourse().addStudentToCourse(student14);
        student14.getCoursesPerStudent().addCourseToStudent(course3);
        course2.getStudentsPerCourse().addStudentToCourse(student14);
        student14.getCoursesPerStudent().addCourseToStudent(course2);

        Student student15 = new Student("Lefteris", "Perdikogiannis", LocalDate.of(1992, 11, 19), 144.00f);
        allStudentsList.add(student15);
        course1.getStudentsPerCourse().addStudentToCourse(student15);
        student15.getCoursesPerStudent().addCourseToStudent(course1);
        course2.getStudentsPerCourse().addStudentToCourse(student15);
        student15.getCoursesPerStudent().addCourseToStudent(course2);
    }
}
