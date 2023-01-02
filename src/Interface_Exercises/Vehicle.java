package Interface_Exercises;

public interface Vehicle {
    String vehicleType = null;
    int price = 0;

    void printCarDetails(String vehicleType, int price);
}

class Car implements Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.printCarDetails("MPV", 1500000);
    }

    @Override
    public void printCarDetails(String vehicleType, int price) {
        System.out.println(vehicleType + "\n" + price);
    }
}