package ch4;

public class LambdaAndScope {
    public static void main(String[] args) {
        int c = 5;
        Calculator calculator = (a, b) -> c + a;
    }
}
