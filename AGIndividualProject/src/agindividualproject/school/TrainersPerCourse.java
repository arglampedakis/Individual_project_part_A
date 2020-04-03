package agindividualproject.school;

import java.util.ArrayList;

/**
 * @author Argiris Glampedakis
 */
public class TrainersPerCourse {

    private final ArrayList<Trainer> trainersList;

    public TrainersPerCourse() {
        trainersList = new ArrayList<>();
    }

    public ArrayList<Trainer> getTrainersList() {
        return trainersList;
    }

    public void showTrainersOfCourse() {
        for (int i = 0; i < trainersList.size(); i++) {
            System.out.println((i + 1) + ". " + trainersList.get(i));
        }
    }

    public void addTrainerToCourse(Trainer trainer) {
        this.trainersList.add(trainer);
    }
}
