import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("offset: " + dateTime);
        System.out.println("format full: " + full(dateTime));
        System.out.println("format medium: " + medium(dateTime));
        System.out.println("format short: " + notLong(dateTime));
    }

    public static String full(OffsetDateTime dateTime){
        String dateAndTime = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return dateAndTime;
    }

    public static String medium (OffsetDateTime dateTime) {
        String dateAndTime = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return dateAndTime;
    }

    public static String notLong (OffsetDateTime dateTime) {
        String dateAndTime = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return dateAndTime;
    }
}