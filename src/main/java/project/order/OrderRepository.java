package project.order;

import java.util.stream.Stream;

public class OrderRepository {
    public static void main(String[] args) {
        Stream.generate(() -> "A").filter(a -> a.length() > 0);
    }
}
