package ch3.challenge;

public class Main {
    public static void main(String[] args) {
        TransformCamelCase transformCamelCase = new TransformCamelCase();
        System.out.println(transformCamelCase.transformScreamingSnakeCaseText("This is a test"));
        TransformScreamingSnakeCase transformScreamingSnakeCase = new TransformScreamingSnakeCase();
        System.out.println(transformScreamingSnakeCase.transformTextCamelCase("This is a test"));

    }

}
