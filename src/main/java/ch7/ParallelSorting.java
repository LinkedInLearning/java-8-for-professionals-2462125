package ch7;

import java.util.Arrays;
import java.util.Random;

public class ParallelSorting {
    public static void main(String[] args) {
        int[] simpleArr1 = new int[10000000];
        int[] simpleArr2 = new int[10000000];
        Random random = new Random();

        for(int i = 0; i < simpleArr1.length; i++) {
            int item = random.nextInt();
            simpleArr1[i] = item;
            simpleArr2[i] = item;
        }

        long startParallel = System.currentTimeMillis();
        Arrays.parallelSort(simpleArr1);
        long endParallel = System.currentTimeMillis();
        System.out.println(simpleArr1);
        System.out.println("Parallel sorting took: " + (endParallel - startParallel));

        long startSequential = System.currentTimeMillis();
        Arrays.sort(simpleArr2);
        long endSequential = System.currentTimeMillis();
        System.out.println(simpleArr2);
        System.out.println("Sequential sorting took: " + (endSequential - startSequential));

    }
}
