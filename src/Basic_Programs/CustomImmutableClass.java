/*
  1. Declare the class as final so it can’t be extended.
  2. Make all of the fields private so that direct access is not allowed.
  3. Don’t provide setter methods for variables.
  4. Make all mutable fields final so that a field’s value can be assigned only once.
  5. Initialize all fields using a constructor method performing deep copy.
  6. Perform cloning of objects in the getter methods to return a copy rather than
     returning the actual object reference.
*/
package Basic_Programs;

class Data{
    int number;
    Data(int number){
        this.number = number;
    }
}

public final class CustomImmutableClass {
    private final int id;
    private final String str;
    private final Data data;

    public int getInt() {
        return id;
    }
    public String getString() {
        return str;
    }

    public CustomImmutableClass(int id, String str, Data data) {
        this.id = id;
        this.str = str;
        Data newData = new Data(data.number);
        this.data = newData;
    }

    public static void main(String[] args) {
        Data data = new Data(10);
        CustomImmutableClass obj = new CustomImmutableClass(101, "abc", data);
        System.out.println(obj.getInt());
        System.out.println(obj.getString());
        System.out.println(obj.data.number);
        data.number = 30;
        System.out.println(obj.data.number);
    }
}
