package Abstraction_Exercises;

abstract class AbstractionExercise {
    AbstractionExercise(){
        System.out.println("In Abstract class constructor");
    }
    abstract void printName(String name);
    void printSalary(int salary) {
        System.out.println(salary);
    }
}
class ImplClass extends AbstractionExercise {
    ImplClass(){
        super();
    }

    @Override
    void printName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        ImplClass obj = new ImplClass();
        obj.printName("abc");
        obj.printSalary(200000);
    }
}