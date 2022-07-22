package ch3;

public interface Foldable {
    static void printFoldInstructions() {
        System.out.println("Carefully fold the object.");
    }

//    void fold();

    default void fold() {
        System.out.println("Folding the object.");
    }
}
