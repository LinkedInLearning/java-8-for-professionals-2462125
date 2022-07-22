package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        String[] names = { "Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" };
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        // filter
        nameList.stream().filter(s -> s.startsWith("M")).forEach(s -> System.out.println(s));

        // map
        nameList.stream().map(s -> s + " student").forEach(s -> System.out.println(s));

        // flatmap
        String[][] names2d = { names, names };

        String[] names1d = Stream.of(names2d)
                .flatMap(arr -> Stream.of(arr))
                .peek(s -> System.out.println("peek:" + s))
                .toArray(size -> new String[size]);

//        for(String name : names1d) {
//            System.out.println("1d arr: " + name);
//        }

        // skip and limit
        Arrays.stream(names1d).skip(1).forEach(s -> System.out.println("skip: " + s));
        Arrays.stream(names1d).limit(1).forEach(s -> System.out.println("limit: " + s));
        Arrays.stream(names1d).skip(3).limit(5).forEach(s -> System.out.println("skip and limit: " + s));

        // distinct
        long nrOfDistinctValues = Arrays.stream(names1d).distinct().count();
        System.out.println("distinct values: " + nrOfDistinctValues);

        // sorted
        Arrays.stream(names1d).sorted().forEach(s -> System.out.println("sorted: " + s));
    }
}
