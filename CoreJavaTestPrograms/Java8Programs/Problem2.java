package Java8Programs;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "abc");
        map.put(7, "ksdk");
        map.put(2, "sldk");
        map.put(1, "opoz");
        map.put(4, "zski");
        map.put(8, "bask");

        System.out.println(map);

        System.out.println("\nSorting based on keys");
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (Integer key : keys)
            System.out.println("Key : " + key + ", Value : " + map.get(key));

        List<String> values = new ArrayList<>(map.values());
        Collections.sort(values, String::compareTo);

        System.out.println("\nSorting based on Values: ");
        for (String str : values) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(str))
                    System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
            }
        }
    }
}
