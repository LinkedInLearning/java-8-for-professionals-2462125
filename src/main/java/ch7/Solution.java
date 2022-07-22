package ch7;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // 1 create a switch statement for setting an int to a value based on the text input
        // write the cases for 1-3 (so "one" should set the int to 1)
        String number = "two";

        int nr = 0;

        switch (number) {
            case "one":
                nr = 1;
                break;
            case "two":
                nr = 2;
                break;
            case"three":
                nr = 3;
                break;
            default:
                System.out.println("I'm not sure what number that is.");
                break;
        }

        // 2 create an array of strings with fruits and sort this using parallel sort
        String[] fruits = {"lemon", "grapefruit", "lime", "orange"};
        Arrays.parallelSort(fruits);
        System.out.println(fruits[0]);

        // 3 use unsigned integer  arithmetic to find the remainder of -9 and 2
        int result = Integer.remainderUnsigned(-9, 2);
        System.out.println(result);

    }
}
