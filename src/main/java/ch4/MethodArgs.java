package ch4;

public class MethodArgs {
    public static void main(String[] args) {
        System.out.println(runTester(str -> str.length() > 5, "Maaike"));
        System.out.println(runTester(str -> str.startsWith("P"), "Julianne"));
    }

    public static boolean runTester(Tester t, String str) {
        return t.test(str);
    }
}
