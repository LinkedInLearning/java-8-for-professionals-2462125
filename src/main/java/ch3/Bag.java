package ch3;

public class Bag implements Foldable, Washable {
    public void fold() {
        System.out.println("Folding bag.");
    }

    public void wash() {
        System.out.println("Washing bag.");
    }
}
