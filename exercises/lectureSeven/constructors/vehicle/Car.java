package exercises.lectureSeven.constructors.vehicle;

public class Car extends Vehicle {
    private String brand;

    public Car(String regNo, String brand) { //constructor
        //first row always addresses the constructor in the parent class - Vehicle
        super(regNo);
        this.brand = brand;
    }
}
