package Inheritance_Types.Heirarchical_Inheritance;

class A {
public void display(){
    System.out.println("In class A");
}
}
class B extends A{
    @Override
    public void display(){
        super.display();
        System.out.println("In class B");
    }
}
class C extends A{
    @Override
    public void display(){
        A a = new A();
        a.display();
        System.out.println("In class C");
    }
}
public class Exercise2{
    public static void main(String[] args) {
        C c = new C();
        c.display();
        B b = new B();
        b.display();
    }
}
