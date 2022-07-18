package ch1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.*;

public class FormattingDates {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
       // String formattedDate = ISO_LOCAL_DATE_TIME.format(ldt);
        String formattedDate = BASIC_ISO_DATE.format(ldt);
        System.out.println(formattedDate);
    }
}
