package Test1;

class DynamicArray{
    private int DEFAULT_ARRAY_SIZE = 10;
    private int ARRAY_SIZE = 0;
    private int index = 0;
    private Object[] arr;

    public DynamicArray(){
        arr = new Object[DEFAULT_ARRAY_SIZE];
    }

    public void add(Object object){
        try{
            if(object == null){
                throw new Exception("Invalid value for DynamicArray");
            }

            arr[ARRAY_SIZE] = object;
            ARRAY_SIZE++;

            if(ARRAY_SIZE == arr.length){
                Object[] newArray = new Object[ARRAY_SIZE + 1];
                for(int i =0; i< arr.length; i++)
                    newArray[i] = arr[i];
                arr = newArray;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addAtIndex(int index, Object object){
        try {
            if(index < 0 || index > ARRAY_SIZE){
                throw new ArrayIndexOutOfBoundsException("Invalid DynamicArray index for given value");
            }
            arr[index] = object;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void remove(int index){
        try {
            if(index < 0 || index > ARRAY_SIZE){
                throw new ArrayIndexOutOfBoundsException("Invalid DynamicArray index for given value");
            }

            for(int i = 0; i < arr.length-1; i++){
                if(i >= index){
                    arr[i] = arr[i+1];
                }
            }
            arr[ARRAY_SIZE] = null;
            ARRAY_SIZE--;
            System.gc();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public boolean isEmpty(){
        if(ARRAY_SIZE == 0)
            return true;
        return false;
    }

    public void printAll(){
        for(Object obj : arr)
            if(obj != null)
                System.out.print(obj+" ");
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();
    dynamicArray.add("Alex");
    dynamicArray.add("David");
    dynamicArray.add("Max");
    dynamicArray.add("Alexa");
    dynamicArray.add("Sam");
    dynamicArray.add("James");
    dynamicArray.add("Joe");
    dynamicArray.add("Simmy");
    dynamicArray.add("Jeffer");
    dynamicArray.add("Mischel");
    dynamicArray.add("Martin");
    dynamicArray.add("Stark");

    // printAll method
    dynamicArray.printAll();

    // addAtIndex() method
        System.out.println();
        dynamicArray.addAtIndex(3, "Harry");
        dynamicArray.printAll();

        // remove() method
        System.out.println();
        dynamicArray.remove(-3);
        dynamicArray.printAll();

        // isEmpty() method
        System.out.println();
        if(dynamicArray.isEmpty())
            System.out.println("Dynamic array is empty");
        else
            System.out.println("Dynamic array is not empty");
    }
}
