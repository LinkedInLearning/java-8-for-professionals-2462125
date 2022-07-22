package ch5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        String[] names = {"Rylee", "Tomas", "Angelique", "Youssef", "Natalie", "Maaike", "Ella",
                "Anya", "Satish", "Antony", "Jerry", "Fatima"};


        // Stream: result is list with values that start with an A or a
        List<String> nameList = Arrays.stream(names)
                .filter(s -> s.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(nameList);


        // Stream: result is the print statements of the modified elements
        Arrays.stream(names)
                .map((name) -> name.equals("Maaike") ? name : String.format("%s student", name))
                .forEach(s -> System.out.println(s));

        // Stream: result is a new list with only Angelique and Anya in it
        // print before terminal operator
        List<String> newNamesList = nameList.stream()
                .filter(name -> !name.equals("Antony"))
                .peek(name -> System.out.println(name))
                .collect(Collectors.toList());

        System.out.println(newNamesList);

    }

}


