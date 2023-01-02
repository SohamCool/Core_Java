package Inheritance_Types.Multilevel_Inheritance;

class A{
    public void display(){
        System.out.println("In class A");
    }
}
class B extends A{
    public void display(){
        A obj = new A();
        obj.display();
        System.out.println("In class B");
    }
}
public class Exercise2 extends B {
    public void display(){
        B obj =  new B();
        obj.display();
    }

    public static void main(String[] args) {
        Exercise2 obj =new Exercise2();
        obj.display();
    }
}
