package Testing;

public interface PublicTransport {
    default void display(){
        System.out.println("Public transport");
    }
}
