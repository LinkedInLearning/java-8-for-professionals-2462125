package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonStreamExamples {
    public static void main(String[] args) {
        String[] names = { "Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" };
        List<String> nameList = new ArrayList<>();

        for(String name : names) {
            if(name.startsWith("A") || name.startsWith("a")) {
                nameList.add(name);
            }
        }

        System.out.println(nameList);

        for(int i = 0; i < names.length; i++) {
            if(!names[i].equals("Maaike")) {
                names[i] += " student";
            }
            System.out.println(names[i]);
        }

//        List<String> newNamesList = new ArrayList<>(Arrays.asList(names));
//        for(String name : newNamesList) {
//            if(name.equals("Maaike")) {
//                newNamesList.remove(name);
//            }
//        }


    }
}
