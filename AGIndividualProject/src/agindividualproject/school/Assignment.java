package agindividualproject.school;

import java.time.LocalDate;

/**
 * @author Argiris Glampedakis
 */
public class Assignment {

    private String assignementTitle;
    private LocalDate subDateTime;
    private String description;
    private float oralMark;
    private float totalMark;

    public Assignment() {
    }

    public Assignment(String assignementTitle, LocalDate subDateTime, String description, float oralMark, float totalMark) {
        this.assignementTitle = assignementTitle;
        this.subDateTime = subDateTime;
        this.description = description;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getAssignementTitle() {
        return assignementTitle;
    }

    public void setAssignementTitle(String assignementTitle) {
        this.assignementTitle = assignementTitle;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getOralMark() {
        return oralMark;
    }

    public void setOralMark(float oralMark) {
        this.oralMark = oralMark;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Title: " + assignementTitle + ", SubDateTime: " + subDateTime + ", Description: " + description + ", Oral Mark: " + oralMark + ", Total Mark: " + totalMark;
    }

}
