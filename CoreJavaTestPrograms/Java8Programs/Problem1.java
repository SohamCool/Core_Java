package Java8Programs;

import java.util.*;
import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++)
            list.add(i);

        // list.stream().filter(element -> element>= 35 && element <= 50).forEach(System.out::println);
        IntStream.range(35, 51).forEach(System.out::println);
    }
}
