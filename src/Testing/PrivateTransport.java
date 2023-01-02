package Testing;

public interface PrivateTransport {
    default void display(){
        System.out.println("Private transport");
    }
}
