package ch2;

import ru.d_shap.base64.Base64Helper;

public class Challenge {
    public static void main(String[] args) {
        String bye = "Bye";
        System.out.println(toBase64(bye.getBytes()));
    }

    public static String toBase64(byte[] data) {
        // Using external library
        return Base64Helper.toBase64(data);
    }
}
