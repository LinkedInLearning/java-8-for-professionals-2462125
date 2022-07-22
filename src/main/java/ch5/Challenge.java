package ch5;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        String[] names = { "Rylee", "Tomas", "Angelique", "Youssef", "Natalie", "Maaike", "Ella",
                "Anya", "Satish", "Antony", "Jerry", "Fatima" };
        List<String> nameList = new ArrayList<>();

        // replace with Stream: result is list with values that start with an A or a
        for(String name : names) {
            if(name.startsWith("A") || name.startsWith("a")) {
                nameList.add(name);
            }
        }
        System.out.println(nameList);

        // replace with Stream: result is the print statements of the modified elements
        for(int i = 0; i < names.length; i++) {
            if(!names[i].equals("Maaike")) {
                names[i] += " student";
            }
            System.out.println(names[i]);
        }

        // replace with Stream: result is a new list with only Angelique and Anya in it
        // print before terminal operator
        List<String> newNamesList = new ArrayList<>(nameList);
        for(String name : nameList) {
            if(name.equals("Antony")) {
                newNamesList.remove(name);
            }
            System.out.println(name);
        }
        System.out.println(newNamesList);

    }

}
