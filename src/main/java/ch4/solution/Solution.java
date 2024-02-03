package ch4.solution;// Write your answer here, and then test your code.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static Actionable executeMethodInterface(String[] args) {
        Actionable o = runActionable(() -> System.out.println("Hello World!"));
        return o;
    }

    private static Actionable runActionable(Actionable print) {
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

