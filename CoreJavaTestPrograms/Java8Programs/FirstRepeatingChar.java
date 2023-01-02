package Java8Programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "Java programming language is awesome";
        str = str.replaceAll("\\s", "");
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        Optional n = list.stream().filter(o -> Collections.frequency(list, o) > 1)
                .findFirst();
        System.out.println(n.get());

        // Another way
        Set<Character> set = new HashSet<>();
        Optional n1 = list.stream().filter(ch -> !set.add(ch)).findFirst();
        System.out.println(n1.get());

        // 2nd repetitive char
        List<Character> result = list.stream().filter(o -> Collections.frequency(list, o) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result.get(1));

        // 2nd repetitive char (Another way)
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(o->o.getValue()>1)
                .map(Map.Entry::getKey).distinct()
                .forEach();
    }
}
