package ch1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class FormattingDates {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);
        System.out.println(formattedDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(ldt));
        String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
        System.out.println(formatStyleDate);
    }
}
