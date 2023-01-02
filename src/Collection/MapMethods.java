package Collection;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mercedes");
        map.put(2, "Jaguar");
        map.put(3, "TATA");
        map.put(4, "Mahindra");
        map.put(5, "Hyundai");
        System.out.println(map);

        // containsKey()
        System.out.println(map.containsKey(5));

        // containsValue()
        System.out.println(map.containsValue("Mahindra"));

        // entrySet()
        System.out.println(map.entrySet());

        // equals()
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Mercedes");
        map1.put(2, "Jaguar");
        map1.put(3, "TATA");
        map1.put(4, "Mahindra");
        map1.put(5, "Hyundai");
        System.out.println(map.equals(map1));

        // clears()
        map1.clear();
        System.out.println(map1);

        // get()
        System.out.println(map.get(3));

        // hashCode()
        System.out.println(map.hashCode());

        // isEmpty()
        System.out.println(map1.isEmpty());

        // keySet()
        System.out.println(map.keySet());

        // put()
        map1.put(6, "Porsche");

        // putAll()
        map.putAll(map1);
        System.out.println(map);

        // remove()
        map.remove(6);
        System.out.println(map);

        // size()
        System.out.println(map.size());

        // values()
        System.out.println(map.values());

        // getOrDefault()
        System.out.println(map.getOrDefault(6, "RollsRoyce"));
        System.out.println(map);

        // merge()
        map1.put(1, "Honda");
        map1.put(2, "Toyota");
        map1.forEach((key, value) -> map.merge(key, value,(v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        System.out.println(map);

        // putIFAbsent()
        map1.putIfAbsent(3, "BMW");
        System.out.println(map1);
        map1.putIfAbsent(3, "Audi");
    }
}