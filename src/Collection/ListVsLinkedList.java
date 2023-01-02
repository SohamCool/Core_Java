package Collection;

import java.util.*;

public class ListVsLinkedList {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(11, "a");
        hashMap.put(12, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(555, "e");
        hashMap.put(6, "f");
        hashMap.put(7000000, "g");
        hashMap.put(8, "h");
        hashMap.put(9, "i");
        hashMap.put(10, "j");
        hashMap.put(1, "k");
        hashMap.put(2, "l");

        System.out.println(hashMap);
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(11, "a");
        map.put(12, "b");
        map.put(3, "c");
        map.put(4, "a");
        map.put(5, "b");
        map.put(6, "c");
        map.put(7, "a");
        map.put(8, "b");
        map.put(9, "c");
        map.put(10, "a");
        map.put(1, "b");
        map.put(2, "c");

        System.out.println(map);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(11, "a");
        treeMap.put(12, "b");
        treeMap.put(3, "c");
        treeMap.put(4, "a");
        treeMap.put(5, "b");
        treeMap.put(6, "c");
        treeMap.put(7, "a");
        treeMap.put(8, "b");
        treeMap.put(9, "c");
        treeMap.put(10, "a");
        treeMap.put(1, "b");
        treeMap.put(2, "c");

        System.out.println(treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(11, "a");
        hashTable.put(12, "b");
        hashTable.put(3, "c");
        hashTable.put(4, "d");
        hashTable.put(555, "e");
        hashTable.put(6, "f");
        hashTable.put(7000000, "g");
        hashTable.put(8, "h");
        hashTable.put(9, "i");
        hashTable.put(10, "j");
        hashTable.put(1, "k");
        hashTable.put(2, "l");
        System.out.println(hashTable);
    }
}
