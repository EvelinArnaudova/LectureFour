package exercises.lectureEight.inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private double length;
    private double width;
    private double weight;
    private int horsePower;
    private int maxSpeed;

    public Vehicle(String brand, String model, double length, double width, double weight, int horsePower, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    protected void honk(){
        System.out.println("beep beep");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
