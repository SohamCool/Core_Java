package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMethods {
    public static void main(String[] args) {
        // Creating list
        List<String> nameList = new ArrayList<>();

        // add() method
        nameList.add("Aditya");
        nameList.add("Rachit");
        nameList.add("Priyanka");
        nameList.add("Atharva");
        nameList.add("Siddhant");
        nameList.add("Kavita");
        nameList.add("Sushant");

        Set<Integer> idSet = new HashSet<>();
        idSet.add(200);
        idSet.add(201);

        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Atharva");
        nameList1.add("Kavita");

        List<String> nameList2 = new ArrayList<>();
        nameList2.add("Aadinath");
        nameList2.add("Vidya");
        nameList2.add("Ashish");
        nameList2.add("Abhishek");
        nameList2.add("Sushrut");

        // addAll() method
        nameList.addAll(nameList2);
        System.out.println(nameList);

        // size() method
        System.out.println(nameList.size());

        // contains() method
        System.out.println(nameList2.contains("Ashish"));

        // containsAll() method
        System.out.println("nameList contains all elements of nameList1 : "+nameList.containsAll(nameList1));

        // get() method
        System.out.println(nameList.get(3));

        // set() method
        nameList.set(1, "Vedant");
        System.out.println(nameList.get(1));

        // isEmpty()
        System.out.println("nameList2 is empty : "+nameList2.isEmpty());

        // subList()
        System.out.println("List elements from index 3 to "+nameList.subList(3, 6));

        // toArray()
        Object[] arr = nameList2.toArray();
        System.out.println("Array elements: ");
        for(int i =0; i<arr.length;i++)
            System.out.print(arr[i]+", ");
    }
}
