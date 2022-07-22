package ch2;


import java.util.Base64;

public class Solution {
    public static void main(String[] args) {
        String bye = "Bye";
        System.out.println(toBase64Java8(bye.getBytes()));
    }

    public static String toBase64Java8(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }
}
