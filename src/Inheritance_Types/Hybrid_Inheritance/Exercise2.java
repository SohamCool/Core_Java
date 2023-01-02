package Inheritance_Types.Hybrid_Inheritance;
class Languages{
   public void display(){
       System.out.println("Language");
   }
}
class Java extends Languages{
    public void display(){
        Languages obj = new Languages();
        obj.display();
        System.out.println("Java");
    }
}
class Python extends Languages{
    public void display(){
        Languages obj = new Languages();
        obj.display();
        System.out.println("Python");
    }
}
public class Exercise2 extends Java {
    public static void main(String[] args) {
        Java java = new Java();
        java.display();
    }
}