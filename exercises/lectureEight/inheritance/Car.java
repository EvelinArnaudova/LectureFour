package exercises.lectureEight.inheritance;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean doorClosed = true;

    public Car(String brand, String model, double length, double width, double weight, int horsePower, int maxSpeed, int numberOfDoors) {
        super(brand, model, length, width, weight, horsePower, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public void closeOpenDoor(){

    }
}
