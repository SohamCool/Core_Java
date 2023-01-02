package Java8Programs;

import java.util.*;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateArrElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{12, 2, 34, 21, 2, 34, 10});
         list.stream().filter(o -> Collections.frequency(list, o) > 1)
                  .collect(Collectors.toSet()).forEach(System.out::println);

        list.stream().filter(o -> Collections.frequency(list, o) > 1)
                .distinct().forEach(System.out::println);

        /*list.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);*/

        // Another way
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(o -> o.getValue() > 1)
                .map(Map.Entry::getKey).distinct()
                .forEach(System.out::println);
    }
}
