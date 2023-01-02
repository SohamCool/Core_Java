package Testing;

public class Vehicle implements PublicTransport, PrivateTransport{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.display();
    }

    @Override
    public void display() {
        PrivateTransport.super.display();
        PublicTransport.super.display();
    }
}