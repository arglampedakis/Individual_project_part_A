package agindividualproject.school;

/**
 * @author Argiris Glampedakis
 */
public class Trainer {

    private String trainerFirstName;
    private String trainerLastName;
    private String subject;

    public Trainer() {
    }

    public Trainer(String trainerFirstName, String trainerLastName, String subject) {
        this.trainerFirstName = trainerFirstName;
        this.trainerLastName = trainerLastName;
        this.subject = subject;
    }

    public String getTrainerFirstName() {
        return trainerFirstName;
    }

    public void setTrainerFirstName(String trainerFirstName) {
        this.trainerFirstName = trainerFirstName;
    }

    public String getTrainerLastName() {
        return trainerLastName;
    }

    public void setTrainerLastName(String trainerLastName) {
        this.trainerLastName = trainerLastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "First Name: " + trainerFirstName + ", Last Name: " + trainerLastName + ", Subject: " + subject;
    }
}
