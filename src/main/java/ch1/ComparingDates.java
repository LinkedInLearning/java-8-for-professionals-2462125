package ch1;

import java.time.LocalDateTime;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022, 2, 1, 2, 3);

        System.out.println(ldt1.compareTo(ldt2));
        System.out.println("is after: " + ldt1.isAfter(ldt2));
        System.out.println("is before: " + ldt1.isBefore(ldt2));
        System.out.println("is equal: " + ldt1.isEqual(ldt2));


    }
}
