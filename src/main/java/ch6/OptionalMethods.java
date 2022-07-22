package ch6;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Optional<User> emptyOptional = Optional.empty();
        System.out.println("empty optional:" + emptyOptional.isPresent());

        Optional<User> userOptional = Optional.of(new User("Lisa"));
        System.out.println("lisa optional:" + userOptional.isPresent());

        User user = null;
        Optional<User> nullOptional = Optional.ofNullable(user);
        System.out.println("null optional:" + nullOptional.isPresent());

        System.out.println(userOptional.orElseGet(() -> new User("Marina")));

        System.out.println(userOptional.filter(u -> u.getName().startsWith("X")).orElse(new User("Luke")));

        Optional<Integer> integerOptional = Optional.of(30);
        System.out.println("mapped integer: " + integerOptional.map(i -> i * 2).get());
    }
}
