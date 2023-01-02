package Inheritance_Types.Single_Inheritance;

public class A {
public void display(){
    System.out.println("A");
}
}
class B extends A{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
