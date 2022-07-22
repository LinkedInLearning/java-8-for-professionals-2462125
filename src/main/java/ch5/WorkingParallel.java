package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingParallel {
    public static void main(String[] args) {
        // different outcome with parallel stream
        int total = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .reduce(1, (x, y) -> x + y);
        System.out.println(total);

        // performance test
        String[] names = { "Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike" };
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        long startPar = System.currentTimeMillis();
        nameList.parallelStream()
                .filter(s -> s.startsWith("M"))
                .forEach(s -> System.out.println(s));
        long endPar = System.currentTimeMillis();
        System.out.println("Parallel took: " + (endPar - startPar));

        long startSeq = System.currentTimeMillis();
        nameList.stream()
                .filter(s -> s.startsWith("M"))
                .forEach(s -> System.out.println(s));
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential took: " + (endSeq - startSeq));

    }
}
