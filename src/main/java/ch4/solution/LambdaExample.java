package ch4.solution;

public class LambdaExample {

    public static void main(String[] args) {
        Actionable actionable = () -> System.out.println("Hello World!");
        runAction(actionable);
        printHelloWorldMapped((s) -> s.toUpperCase());
    }

    private static void runAction(Actionable action) {
        action.run();
    }

    private static void printHelloWorldMapped(StringMappable map) {
        System.out.println(map.mapString("hello world!"));
    }
}
