package ch2.solution;

import java.util.Base64;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the largest number in the 'numbers' array
    static String encodeToStringJava8(String str) {
        return toBase64(str.getBytes());
    }

    static String toBase64(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

}
