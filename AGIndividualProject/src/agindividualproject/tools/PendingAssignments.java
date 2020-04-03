package agindividualproject.tools;

import agindividualproject.school.*;
import static agindividualproject.tools.Creations.allStudentsList;
import static agindividualproject.tools.Creations.sc;
import static agindividualproject.tools.StringToLocalDate.stringToLocalDate;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;

/**
 * @author Argiris Glampedakis
 */
public class PendingAssignments {

    private static final WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
    private static final TemporalField weekOfYear = weekFields.weekOfWeekBasedYear();

    public static void showStudentsWithPendingAssignments() {
        ArrayList<Student> stdsWthPndngAsgmnts = new ArrayList<>();
        System.out.print("Insert the date (DD-MM-YYYY) to see the Students that need to submit one or more Assignments: ");
        LocalDate chosenDate = stringToLocalDate(sc.next());//converting the given date from String to LocalDate
        int weekNumber = chosenDate.get(weekOfYear);// Gets the number of week of the year from the given Date
        int chosenYear = chosenDate.getYear();//gets the year of the chosen date
        System.out.println("The date you provided is in the week No" + weekNumber + " of the year.");

        for (int i = 0; i < allStudentsList.size(); i++) {//check all students
            ArrayList<Assignment> tempList = allStudentsList.get(i).getCoursesPerStudent().getAllAssignmentsOfStudent();//get the list of All the Assignemtns of the Student(i)

            for (int j = 0; j < tempList.size(); j++) {
                int weekOfSubDate = tempList.get(j).getSubDateTime().get(weekOfYear);//gets the number of week of the Submission date of the Assignment
                int yearOfSubDate = tempList.get(j).getSubDateTime().getYear();
                if (weekOfSubDate == weekNumber && yearOfSubDate == chosenYear) {//if the Submission date of the Assignment and the given date are on the same week of the Year
                    stdsWthPndngAsgmnts.add(allStudentsList.get(i));//add the student that has pending assignment(s) to the list
                }
            }
        }
        if (stdsWthPndngAsgmnts.isEmpty()) {
            System.out.println("No Students with pending Assignments found!");
        } else if (stdsWthPndngAsgmnts.size() == 1) {
            System.out.println("Only one Student with Pending Assignemnt(s) found: ");
            System.out.println(stdsWthPndngAsgmnts.get(0));
        } else {
            System.out.println("The following Students need to submit one or more Assignments during the week No" + weekNumber + " :\n");
            for (int i = 0; i < stdsWthPndngAsgmnts.size(); i++) {
                System.out.println((i + 1) + ". " + stdsWthPndngAsgmnts.get(i));
            }
        }
    }

}
