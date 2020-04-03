package agindividualproject.school;

import java.util.ArrayList;

/**
 * @author Argiris Glampedakis
 */
public class AssignmentsPerCourse {

    private final ArrayList<Assignment> assignmentsList;

    public AssignmentsPerCourse() {
        assignmentsList = new ArrayList<>();
    }

    public ArrayList<Assignment> getAssignmentsList() {
        return assignmentsList;
    }

    public void showAssignmentsOfCourse() {
        for (int i = 0; i < assignmentsList.size(); i++) {
            System.out.println((i + 1) + ". " + assignmentsList.get(i));
        }
    }

    public void addAssignmentToCourse(Assignment assignment) {
        this.assignmentsList.add(assignment);
    }
}
