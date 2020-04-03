package agindividualproject.tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static validation.Validate.validateDateString;

/**
 * @author Argiris Glampedakis
 */
public class StringToLocalDate {

    public static LocalDate stringToLocalDate(String dateString) {
        String date = validateDateString(dateString);//checking if the given String can be converted to localDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);//converting String to LocalDate
        return localDate;
    }

}
