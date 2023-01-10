package exercises.lectureEight.abstraction.examplesinterface;

public class Lion extends Cat implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Roar");
    }

    @Override
    public void sleep() {
        System.out.println("18 hours a day");
    }
}
