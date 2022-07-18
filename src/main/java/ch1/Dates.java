package ch1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {

        // DEMO 1

        // localdate
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2014, 3, 17);
        LocalDate ld3 = LocalDate.of(2022, Month.DECEMBER, 25);

        //show what happens with invalid date
       // LocalDate invalidDate = LocalDate.of(2022, 13, 1);

        // localtime
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(12, 8);
        LocalTime lt3 = LocalTime.of(22, 1, 3, 5);

        //show what happens with invalid time

        // localdatetime
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022, 12, 25, 12, 8);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);

        //show what happens with invalid datetime

        // DEMO 2

        ld1.getYear();


        System.out.println(ldt2);


    }
}
