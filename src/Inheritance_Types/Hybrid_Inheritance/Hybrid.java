package Inheritance_Types.Hybrid_Inheritance;

class C {
    public void display(){
        System.out.println("C");
    }
}
class B extends C{
    public void display(){
        System.out.println("B");
    }
}
class A extends C{
    public void display(){
        System.out.println("A");
    }
}
class D extends B{
    public void display(){
        System.out.println("D");
    }
    public static void main(String[] args) {
        D obj =new D();
        obj.display();
    }
}