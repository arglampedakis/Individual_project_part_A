/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agindividualproject.tools;

import agindividualproject.school.*;
import static agindividualproject.tools.StringToLocalDate.*;
import java.time.LocalDate;
import static validation.Validate.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author glamb
 */
public class Creations {

    public static final Scanner sc = new Scanner(System.in);
    public static final ArrayList<Trainer> allTrainersList = new ArrayList<>();
    public static final ArrayList<Student> allStudentsList = new ArrayList<>();
    public static final ArrayList<Assignment> allAssignmentsList = new ArrayList<>();
    public static final ArrayList<Course> allCoursesList = new ArrayList<>();

    public static void createCourse() {//creates a new object from class Course and adds it to the allCoursesList
        System.out.print("How many Courses would you like to add? \nNumber of Courses I'd like to add = ");
        int numOfCourses = validateEntry(sc.nextInt());

        for (int i = 0; i < numOfCourses; i++) {
            Course course = new Course();
            System.out.println("- Course Number: " + (i + 1) + " -\n");

            System.out.print("Insert the Title of the Course: ");
            sc.nextLine();
            course.setCourseTitle(sc.nextLine());

            System.out.print("Insert the Type of the Course(Full/Part): ");
            course.setCourseType(sc.nextLine());

            System.out.print("Insert the Start Date of the Course(DD-MM-YYYY): ");
            LocalDate startDate = validateStartDateOfCourse(sc.next());
            course.setCourseStartDate(startDate);

            System.out.print("Insert the End Date of the Course(DD-MM-YYYY): ");
            course.setCourseEndDate(validateEndDateOfCourse(sc.next(), startDate));

            System.out.print("Insert the Stream of the Course (Java/C#): ");
            course.setCourseStream(sc.next());

            allCoursesList.add(course);
            System.out.println("Course " + course.getCourseTitle() + " added!\n");
        }
    }

    public static void createAssignment() {//creates a new object from class Assignment and adds it to the allAssignmentsList

        System.out.print("How many Assignments would you like to create? \nNumber of Assignments = ");
        int numOfAssignments = validateEntry(sc.nextInt());
        for (int i = 0; i < numOfAssignments; i++) {
            Assignment assignment = new Assignment();
            System.out.println("- Assignment number: " + (i + 1) + " - \n");
            System.out.print("Insert the Title of the Assignment: ");
            assignment.setAssignementTitle(sc.next());
            System.out.print("Insert the description of the Assignment in one line: ");
            sc.nextLine();
            assignment.setDescription(sc.nextLine());
            System.out.print("Insert the oral Mark of the Assignment: ");
            assignment.setOralMark(validateEntry(sc.nextFloat()));
            System.out.print("Insert the total Mark of the Assignment: ");
            assignment.setTotalMark(validateEntry(sc.nextFloat()));
            allAssignmentsList.add(assignment);
            System.out.println("Assignment \"" + assignment.getAssignementTitle() + "\" created!");
            System.out.println("In which Course the Assignment \"" + assignment.getAssignementTitle() + "\" will be part of?");
            Course selectedCourse = PrintTools.selectCourse();
            selectedCourse.getAssignmentsPerCourse().getAssignmentsList().add(assignment);
            System.out.print("Insert the Submission Date of the Assignment(DD-MM-YYYY): ");
            assignment.setSubDateTime(validateAssignmentSubDate(sc.next(), selectedCourse.getCourseStartDate(), selectedCourse.getCourseEndDate()));
            System.out.println("Added!\n");

        }
    }

    public static void createStudent() {//creates a new object from class Student and adds it to the allStudentsList
        System.out.print("How many Students would you like to create? \nNumber of Students = ");
        int numOfStudents = validateEntry(sc.nextInt());
        for (int i = 0; i < numOfStudents; i++) {
            Student student = new Student();

            System.out.println("- Student Number: " + (i + 1) + " -\n");
            System.out.print("Insert the First Name of the Student: ");
            student.setStudentFirstName(sc.next());
            System.out.print("Insert the Last Name of the Student: ");
            student.setStudentLastName(sc.next());
            System.out.print("Insert the Date Of Birth of the Student (DD-MM-YYYY): ");
            student.setDateOfBirth(stringToLocalDate(validateYearOfBirth(sc.next())));
            System.out.print("Insert the Tuition Fees(€) of the Student: ");
            student.setTuitionFees(validateEntry(sc.nextFloat()));
            allStudentsList.add(student);
            System.out.println("Student " + student.getStudentFirstName() + " " + student.getStudentLastName() + " added in the System!");
            System.out.println("In how many Courses the Student \"" + student.getStudentFirstName() + " " + student.getStudentLastName() + "\" will participate?");
            System.out.print("Num = ");
            int numOfCourses = validateCourseList(validateEntry(sc.nextInt()));

            for (int j = 0; j < numOfCourses; j++) {
                System.out.println("Select the " + (j + 1) + " Course");
                Course selectedCourse = PrintTools.selectCourse();
                selectedCourse.getStudentsPerCourse().addStudentToCourse(student);//add the student to Course's studentList
                student.getCoursesPerStudent().addCourseToStudent(selectedCourse);// add the Course to Student's courseList
                System.out.println("Added!\n");
            }
        }
    }

    public static void createTrainer() {//creates a new object from class Trainer and adds it to the allTrainersList 

        System.out.print("How many Trainers would you like to create? \nNumber of Trainers = ");
        int numOfTrainers = sc.nextInt();
        for (int i = 0; i < numOfTrainers; i++) {
            Trainer trainer = new Trainer();
            System.out.println("- Trainer number: " + (i + 1) + " -");
            System.out.print("Insert the First Name of the Trainer: ");
            trainer.setTrainerFirstName(sc.next());
            System.out.print("Insert the Last Name of the Trainer: ");
            trainer.setTrainerLastName(sc.next());
            System.out.print("Insert the Subject of the Trainer: ");
            trainer.setSubject(sc.next());
            allTrainersList.add(trainer);
            System.out.println("Trainer " + trainer.getTrainerFirstName() + " " + trainer.getTrainerLastName() + " created!");
            int numOfCourses;
            do {
                System.out.print("In how many Courses the Trainer \"" + trainer.getTrainerFirstName() + " " + trainer.getTrainerLastName() + "\" will teach?");
                System.out.print("Num = ");
                numOfCourses = validateEntry(sc.nextInt());
                if (numOfCourses > allCoursesList.size()) {
                    System.out.println("There are only " + allCoursesList.size() + " Courses! Please insert a valid number!");
                }
            } while (numOfCourses > allCoursesList.size());
            for (int j = 0; j < numOfCourses; j++) {
                System.out.println("Select the " + (j + 1) + " Course");
                PrintTools.selectCourse().getTrainersPerCourse().addTrainerToCourse(trainer);
                System.out.println("Added!\n");
            }

        }
    }

}
