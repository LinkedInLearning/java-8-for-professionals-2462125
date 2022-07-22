package ch4.challenge;

public class LambdaExample {

    public static void main(String[] args) {
        printHelloWorldMapped(new StringToUpperCase());
    }

    private static void printHelloWorldMapped(StringMappable map) {
        System.out.println(map.mapString("hello world!"));
    }
}

class PrintHelloWorld implements Actionable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

class StringToUpperCase implements StringMappable {
    @Override
    public String mapString(String value) {
        return value.toUpperCase();
    }
}