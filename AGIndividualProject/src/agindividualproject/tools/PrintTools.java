package agindividualproject.tools;

import validation.Validate;
import agindividualproject.school.*;
import static agindividualproject.tools.Creations.*;

/**
 * @author Argiris Glampedakis
 */
public class PrintTools {

    public static void printStudentsListMethod() {
        System.out.println("\nHere are the First and Last names of all our Students:\n");
        for (Student x : allStudentsList) {
            System.out.println("(" + (allStudentsList.indexOf(x) + 1) + ") " + x);
        }
    }

    public static void printTrainersListMethod() {
        System.out.println("\nHere are the First and Last names of all our Trainers:\n");
        for (Trainer x : allTrainersList) {
            System.out.println("(" + (allTrainersList.indexOf(x) + 1) + ") " + x);
        }
    }

    public static void printAssignmentsListMethod() {
        System.out.println("\nAll Assignments of all courses:\n");
        for (Assignment x : allAssignmentsList) {
            System.out.println("(" + (allAssignmentsList.indexOf(x) + 1) + ") " + x);
        }
    }

    public static void printCoursesListMethod() {
        System.out.println("\nThe available Courses are:\n");
        for (Course x : allCoursesList) {
            System.out.println("(" + (allCoursesList.indexOf(x) + 1) + ") " + x);
        }
    }

    public static void printStudentsWithManyCourses() {
        System.out.println("These students participate in more than one courses: ");
        int k = 1;
        for (int i = 0; i < allStudentsList.size(); i++) {
            int size = allStudentsList.get(i).getCoursesPerStudent().getCoursesOfStudent().size();
            if (size > 1) {
                System.out.println(k + ". " + allStudentsList.get(i));
                System.out.println("Participates in " + size + " Courses");
                k++;
            }
        }
    }

    public static Course selectCourse() {
        printCoursesListMethod();
        System.out.print("Type here the number of the Course: ");
        int indexOfCourseInTheCourseList = Validate.validateCourseList(Validate.validateEntry(sc.nextInt()));
        Course course = allCoursesList.get(indexOfCourseInTheCourseList - 1);
        return course;
    }

    public static Student selectStudent() {
        printStudentsListMethod();
        System.out.print("Type here the number of the Student: ");
        int indexOfStudentInTheStudentList = Validate.validateStudentList(Validate.validateEntry(sc.nextInt()));
        Student student = allStudentsList.get(indexOfStudentInTheStudentList - 1);
        return student;
    }
}
