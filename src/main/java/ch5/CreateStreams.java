package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class CreateStreams {
    public static void main(String[] args) {
        String[] names = { "Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" };
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        // create stream based on array
        Stream<String> arrayStream = Arrays.stream(names);

        // create stream based on collection
        Stream<String> listStream = nameList.stream();

        // create stream using generate method
        Stream<Integer> generateStream = Stream.generate(() -> 5);

        // create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2);

    }
}
