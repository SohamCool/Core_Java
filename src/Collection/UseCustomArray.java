package Collection;

public class UseCustomArray {
    public static void main(String[] args) {
        DynamicArray obj = new DynamicArray();

        // Add method
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");
        obj.add("F");
        obj.add("G");
        obj.add("H");
        obj.add("I");
        obj.add("J");
        obj.add("K");
        obj.add("L");
        obj.add("M");

        // printAll() method
        obj.printAll();
        System.out.println("Custom Array Size : " + obj.size());

        // remove() method
        obj.remove(3);
        obj.printAll();
        System.out.println("Custom Array Size : " + obj.size());

        // isEmpty() method
        DynamicArray obj1 = new DynamicArray();
        System.out.println("DynamicArray (obj1) is empty : "+obj1.isEmpty());
        System.out.println("DynamicArray (dynamicArrays) is empty : "+obj.isEmpty());

        // contains() method
        boolean result = obj.contains("E");
        System.out.println("Is DynamicArray contains element E : "+result);

        // equals() method
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");
        obj1.add("E");
        obj1.add("F");
        obj1.add("G");
        obj1.add("H");
        obj1.add("I");
        obj1.add("J");
        obj1.add("K");
        obj1.add("L");
        obj1.add("M");
        System.out.println("Is obj1 DynamicArray equals to obj DynamicArray : "+obj.equals(obj1));

        obj1.clears();
        obj1.printAll();
    }
}
