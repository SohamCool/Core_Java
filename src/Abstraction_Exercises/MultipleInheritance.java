package Abstraction_Exercises;

abstract interface a{
    abstract void displaya();
}

abstract interface b{
    abstract void displayb();
}

public class MultipleInheritance implements a, b{
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.displaya();
        obj.displayb();
    }

    @Override
    public void displaya() {
        System.out.println("DisplayedA");
    }

    @Override
    public void displayb(){
        System.out.println("DisplayedB");
    }
}
