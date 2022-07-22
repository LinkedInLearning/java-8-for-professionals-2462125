package ch7;

public class StringInSwitchExample {
    public static void main(String[] args) {
        String language = "java";

        switch(language.toLowerCase()) {
            case "java":
                System.out.println("I love Java!");
                break;
            case "python":
                System.out.println("I love Python!");
                break;
            case "c#":
                System.out.println("I love C#!");
                break;
            default:
                System.out.println("Can you teach me that?");
                break;
        }
    }
}
