package ch4;

public class LambdaExpressions {
    public static void main(String[] args) {
        Calculator calculator1 = (a, b) -> a + b;
        Calculator calculator2 = (double a, double b) -> { return a + b; };

        Creator theCreator = () -> "Hello there";
        System.out.println(theCreator.create());

        Tester theTester = str -> { return str.length() > 5; };
        Tester theTester2 = str -> {
          String s = str.substring(0, str.length() - 2);
          if(s.length() == str.length()) {
              return true;
          } else {
              return false;
          }
        };

        System.out.println(theTester.test("Maaike"));
    }
}
