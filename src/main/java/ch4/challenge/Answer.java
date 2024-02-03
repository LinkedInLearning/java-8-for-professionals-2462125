package ch4.challenge;
// Write your answer here, and then test your code.
// Write your answer here, and then test your code.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static Object executeMethodInterface() {
        // Use lambda expressions instead of separate class implementations
        Object o = runActionable(new PrintHelloWorld());
        return o;
    }

    private static Object runActionable(Actionable print) {
        print.run();
        return print;
    }

}

class PrintHelloWorld implements Actionable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}


@FunctionalInterface
interface Actionable {
    void run();
}

