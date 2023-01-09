package homeworks.lectureSeven;

public class Car {
    public static void main (String [] args) {
        Car car = new Car("Audi", "black",true);
    }
    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean secondHand;

    Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;

    }

    Car(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }

    Car(String name, String color, boolean secondHand) {
        this(name, color,-1, -1, secondHand);
    }

    Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this(name, null, releaseYear, horsePower, secondHand );
    }

    Car(){
        System.out.println("No information provided for this car");
    }
}
