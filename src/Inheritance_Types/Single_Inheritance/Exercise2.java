package Inheritance_Types.Single_Inheritance;
class Parent{
    public void display(){
        System.out.println("In parent class");
    }
}
public class Exercise2 extends Parent {
    public static void main(String[] args) {
        // Upcasting
        Parent obj = new Exercise2();
        obj.display();

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        Exercise2 obj1 = (Exercise2) obj;
        obj1.display();
    }
}
