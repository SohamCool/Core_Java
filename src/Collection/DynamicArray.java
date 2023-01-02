package Collection;

public class DynamicArray {
    private Object[] array;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public DynamicArray(){
        array = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return size;
    }

    public void add(Object object){
        array[size] = object;
    size++;
        if(size == array.length) {
            Object[] newArray = new Object[((3 * array.length) / 2) + 1];
            for (int i = 0; i < array.length; i++)
                newArray[i] = array[i];
            array = newArray;
        }
    }

    public Object get(int index){
        return array[index];
    }

    public void set(int index, Object value){
        array[index] = value;
    }

    public boolean isEmpty(){
        if(size <= 0)
            return true;
        return false;
    }

    public void remove(int index){
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        size--;
        array[array.length-1] = null;
        System.gc();
    }

    public void printAll(){
        for(int i = 0; i < size; i++)
            System.out.println(array[i]);
    }

    public boolean contains(Object object){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(object))
                return true;
        }
        return false;
    }

    public boolean equals(DynamicArray obj){
        if(array.equals(obj.array))
            return true;
        return false;
    }

    public void clears(){
        for(int i =0; i< array.length; i++)
            array[i] = null;
    }
}
