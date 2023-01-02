package Inheritance_Types.Multiple_Inheritance;

interface A{
    void displayA();
}
interface B{
    void displayB();
}
public class Exercise2 implements A,B {
    @Override
    public void displayA() {
        System.out.println("A");
    }

    @Override
    public void displayB(){
        System.out.println("B");
    }

}
