package validation;

import static agindividualproject.tools.Creations.allCoursesList;
import static agindividualproject.tools.Creations.allStudentsList;
import static agindividualproject.tools.Creations.sc;
import static agindividualproject.tools.StringToLocalDate.stringToLocalDate;
import java.time.LocalDate;

/**
 * @author Argiris Glampedakis
 */
public class Validate {

    public static float validateEntry(float valid) {
        if (valid > 0) {
            return valid;//if given float is positive, return given float
        } else {//if given float is zero or below, please insert a valid number and check 
            System.out.print("Wrong Input, please try again: ");
            return validateEntry(sc.nextFloat());
        }
    }

    public static int validateEntry(int valid) {
        if (valid > 0) {//if given integer is positive, return given integer
            return valid;
        } else {//if given integer is zero or below, please insert a valid number and check 
            System.out.print("Wrong Input, please try again: ");
            return validateEntry(sc.nextInt());
        }
    }

    public static int validateCourseList(int numOfCourses) {
        if (numOfCourses <= allCoursesList.size()) {//if given integer is smaller that the size of the list, return the integer
            return numOfCourses;
        } else {//if given integer is equal or bigger than the size of the list, please insert a valid number and check 
            System.out.print("There are only " + allCoursesList.size() + " Courses! Please try again: ");
            return validateCourseList(validateEntry(sc.nextInt()));
        }
    }

    public static int validateStudentList(int numOfStudents) {
        if (numOfStudents <= allStudentsList.size()) {//if given integer is smaller that the size of the list, return the integer
            return numOfStudents;
        } else {//if given integer is equal or bigger than the size of the list, please insert a valid number and check 
            System.out.print("There are only " + allStudentsList.size() + " Students! Please try again!");
            return validateStudentList(validateEntry(sc.nextInt()));
        }
    }

    public static String validateDateString(String date) {
        if (date.length() != 10) {// the length of the String "DD-MM-YYYY" is 10
            System.out.print("Invalid format, please try again: ");
            return validateDateString(sc.next());
        }
        if (date.charAt(2) != '-' || date.charAt(5) != '-') {//Checking the position of '-' 
            System.out.print("Invalid format, please try again: ");
            return validateDateString(sc.next());
        }
        for (int i = 0; i < date.length(); i++) {// Checking if the rest of the string contains digits
            if (i == 2 || i == 5) {//skipping the position of '-' that were checked previously
                continue;
            }
            if (!(Character.isDigit(date.charAt(i)))) {//checking for digits
                System.out.print("Invalid format, please try again: ");
                return validateDateString(sc.next());
            }
        }//the format of the String is now "DD-MM-YYYY"
        if (validateDate(date) == false) {//validating that the given date is legit
            System.out.print("The date provided is incorrect. Please try again: ");
            return validateDateString(sc.next());
        }
        return date;
    }

    public static boolean validateDate(String date) {
        String day = date.substring(0, 2);//Extract the DD from "DD-MM-YYYY"
        int dayToInt = Integer.parseInt(day);//then convert the string to int

        String month = date.substring(3, 5);// Extract the MM from "DD-MM-YYYY"
        int monthToInt = Integer.parseInt(month);//then convert the string to int

        String year = date.substring(6, 10);// Extract the YYYY from "DD-MM-YYYY"
        int yearToInt = Integer.parseInt(year);//then convert the string to int

        if (dayToInt > 32 || dayToInt < 0 || monthToInt < 0 || monthToInt > 13 || yearToInt < 1900 || yearToInt > 2100) {
            //Checking if the DD isbetween 1-31, if the MM is between 1-12 and if the YYYY is between 1900-2100
            return false;
        }
        if ((dayToInt >= 29) && (monthToInt == 2) && !((yearToInt % 4) == 0)) {
            //In case of February (2nd month) check if the the DD is greater than 28 for non-leap year
            return false;
        }
        if (((monthToInt == 2) && (dayToInt >= 30) && (yearToInt % 4 == 0))) {
            return false; //In case of February (2nd month) check if the the DD is greater than 29 for leap year 
        }
        if ((monthToInt == 04 || monthToInt == 6 || monthToInt == 9 || monthToInt == 11)) {
            if (dayToInt >= 31) {//check for months with 30 days (April=4, June=6, September=9, November=11)
                return false;
            }
        }
        return true;
    }

    public static String validateYearOfBirth(String dateOfBirth) {
        String date = validateDateString(dateOfBirth);//check if the string is dd-MM-yyyy
        String year = date.substring(6, 10);// Extract the YYYY from "DD-MM-YYYY"
        int yearToInt = Integer.parseInt(year);//convert it to int
        if (yearToInt >= 2002) {//check if is older than 18
            System.out.print("Only adults allowed. Please try again: ");
            return validateYearOfBirth(sc.next());
        } else if (yearToInt <= 1920) {
            System.out.print("That old huh? ^.- Try again: ");
            return validateYearOfBirth(sc.next());
        } else {
            return date;
        }
    }

    public static LocalDate validateStartDateOfCourse(String startDate) {
        LocalDate chosenDate = stringToLocalDate(startDate);
        LocalDate currentDate = LocalDate.now();
        if (chosenDate.isAfter(currentDate)) {
            return chosenDate;
        } else {
            System.out.print("Current date is " + currentDate + ". Please insert a future date: ");
        }
        return validateStartDateOfCourse(sc.next());
    }

    public static LocalDate validateEndDateOfCourse(String endDate, LocalDate startDate) {
        LocalDate chosenDate = stringToLocalDate(endDate);
        if (chosenDate.isAfter(startDate)) {
            return chosenDate;
        } else {
            System.out.print("The End date should be after the Start Date. Please insert a valid date: ");
        }
        return validateEndDateOfCourse(sc.next(), startDate);
    }

    public static LocalDate validateAssignmentSubDate(String subDate, LocalDate startDate, LocalDate endDate) {
        LocalDate chosenDate = stringToLocalDate(subDate);
        if (chosenDate.isAfter(startDate) && chosenDate.isBefore(endDate)) {
            return chosenDate;
        } else {
            System.out.println("The Submission date should be after the Start Date and before the End Date of the Course");
            System.out.println("For this specific course, the Start date is " + startDate + " and the end date is: " + endDate);
            System.out.print("Please insert a date between the Start and End dates: ");
            return validateAssignmentSubDate(sc.next(), startDate, endDate);
        }
    }
}
