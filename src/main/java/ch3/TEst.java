package ch3;

interface Bla {
    static void bla() {
        System.out.println("interface bla");
    }
}

public class TEst implements Bla {
    static void blabla() {
        System.out.println("bla");
        Bla.bla();
    }
}

class Test2 {
    public static void main(String[] args) {
        TEst t = new TEst();
        t.blabla();
        TEst.blabla();
        Bla.bla();
    }
}

