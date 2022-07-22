package ch3.challenge;

public class TransformScreamingSnakeCase implements WordTransformable {
    @Override
    public String transformScreamingSnakeCaseText(String input) {
        String[] inputArr = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String in : inputArr) {
            result.append(in.toUpperCase() + "_");
        }

        String resultString = result.toString();
        return resultString.substring(0, resultString.length() - 1);
    }

    @Override
    public String transformTextCamelCase(String input) {
        String[] inputArr = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String in : inputArr) {
            result.append(in.substring(0, 1).toUpperCase() + in.substring(1));
        }

        return result.toString();

    }
}
