package project.product;

public class Mug extends Product implements Customizeable {
    private String userInput;

    @Override
    public String customize() {
        return userInput;
    }

    public void printCustomPart() {
        System.out.println(customize());
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

}
