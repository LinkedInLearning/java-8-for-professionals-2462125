package ch5.solution;
import java.util.List;
import java.util.stream.Collectors;

// Write your answer here, and then test your code.
class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void filterListOfNames(List<String> names, String nameToBeRemoved) {
        filterListForNamesStartingWithAnA(names);
        appendStudentToTheNamesAndRemoveSpecificName(names, nameToBeRemoved);
    }

    public static List<String> filterListForNamesStartingWithAnA(List<String> names) {
        // Your code goes here, make sure to use the Stream API
        return names
                .stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    public static List<String> appendStudentToTheNamesAndRemoveSpecificName(List<String> names, String nameToBeRemoved) {
        // Your code goes here, make sure to use the Stream API
        return  names
                .stream()
                .filter(name -> !name.equals(nameToBeRemoved))
                .map((name) -> String.format("%s student", name))
                .collect(Collectors.toList());
    }


}
