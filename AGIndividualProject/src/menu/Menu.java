/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import static agindividualproject.tools.Creations.*;
import static agindividualproject.tools.PendingAssignments.showStudentsWithPendingAssignments;
import static agindividualproject.tools.PrintTools.*;
import agindividualproject.tools.SyntheticData;

/**
 *
 * @author glamb
 */
public class Menu {

    public static void everythingMenu() {
        String manualInputChoice;

        do {
            System.out.print("Would you like to manualy add the data? (y/n): ");
            manualInputChoice = sc.next();
            if (!(manualInputChoice.equalsIgnoreCase("Y") || manualInputChoice.equalsIgnoreCase("N"))) {
                System.out.println("Wrong Input, please try again!");
            }
        } while (!(manualInputChoice.equalsIgnoreCase("Y") || manualInputChoice.equalsIgnoreCase("N")));
        if (manualInputChoice.equalsIgnoreCase("N")) {
            //This Class.method adds synthetic data
            SyntheticData.automaticInput();
        } else {
            manualDataMenu();
        }
        System.out.println(" =============");
        System.out.println(" | Main menu |");
        System.out.println(" =============\n");
        printingListsMenu();
    }

    public static void manualDataMenu() {
        System.out.println("Okay! Let's start by creating the Courses of our school");
        createCourse();
        System.out.println("----------------");
        System.out.println("Great! Now, let's create some Assignments for our Courses");
        createAssignment();
        System.out.println("----------------");
        System.out.println("Now that we're done with the Courses, let's go ahead and create our Students");
        createStudent();
        System.out.println("----------------");
        System.out.println("Awesome! Now, let's go ahead and create the Trainers");
        createTrainer();
        System.out.println("----------------");
        System.out.println("Thank you! Our data base is now complete!");
        System.out.println("-----------------\n");

    }

    public static void printingListsMenu() {//This is the print a list menu
        int options;
        do {
            System.out.print("\nPrint the List of:"
                    + "\n(1)All Courses"
                    + "\n(2)All Trainers"
                    + "\n(3)All Students"
                    + "\n(4)All Assignments"
                    + "\n(5)All Students of a Course"
                    + "\n(6)All Trainers of a Course"
                    + "\n(7)All Assignments of a Student "
                    + "\n(8)All Assignments of a Course "
                    + "\n(9)All Students that belong to more than one Courses"
                    + "\n(10)Students that need to submit Assignment(s)"
                    + "\n(0)Exit "
                    + "\nChoose an option: ");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    //print All Courses
                    printCoursesListMethod();
                    break;
                case 2:
                    //print All Trainers
                    printTrainersListMethod();
                    break;
                case 3:
                    //print All Students
                    printStudentsListMethod();
                    break;
                case 4:
                    //print All Assignments
                    printAssignmentsListMethod();
                    break;
                case 5:
                    //Select a Course and print All of its Students
                    selectCourse().getStudentsPerCourse().showStudentsOfCourse();
                    break;
                case 6:
                    //Select a Course and print All of its Trainers
                    selectCourse().getTrainersPerCourse().showTrainersOfCourse();
                    break;
                case 7:
                    //Select a Student and print All of their the Assignments
                    selectStudent().getCoursesPerStudent().showAssignmentOfStudent();
                    break;
                case 8:
                    //Select a Course and print All of its Assignments
                    selectCourse().getAssignmentsPerCourse().showAssignmentsOfCourse();
                    break;
                case 9:
                    //Prints the students that belong to more than one courses
                    printStudentsWithManyCourses();
                    break;
                case 10:
                    /*Asks from the user a date and output a list of students who need to submit one 
                      or more assignments on the same calendar week as the given date*/
                    showStudentsWithPendingAssignments();
                    break;
                default:
                    System.out.println("Wrong input, please try again.\n");
                    break;
                case 0://Exit While
            }
        } while (options != 0);
    }

}
