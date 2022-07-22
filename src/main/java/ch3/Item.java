package ch3;


public class Item implements Foldable, Washable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void fold() {
        System.out.println("Folding " + name);
    }

    public void wash() {
        System.out.println("Washing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //Foldable.printFoldInstructions();
        Item item = new Item("Jeans");
        item.fold();
    }
}
