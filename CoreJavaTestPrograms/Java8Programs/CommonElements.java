package Java8Programs;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[]{10, 20, 30, 40});
        List<Integer> list2 = Arrays.asList(new Integer[]{20, 40, 10, 80, 90, 10});
        System.out.println("Common Elements: ");
        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}
