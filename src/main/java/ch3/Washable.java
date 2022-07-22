package ch3;

@FunctionalInterface
public interface Washable {
    default void fold() {
        System.out.println("Folding washed object.");
    }

    void wash();

}
