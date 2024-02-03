package ch3.challenge;
// Write your answer here, and then test your code.
// Your job is to adjust the interface to have static methods.

class Answer {

    // Change these boolean values to control whether you see 
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

}



// Turn into interface with static methods
interface WordTransformer {

    static String transformTextCamelCase(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }

    static String transformScreamingSnakeCaseText(String input) {
        return input.toUpperCase().replace(" ", "_");
    }
}