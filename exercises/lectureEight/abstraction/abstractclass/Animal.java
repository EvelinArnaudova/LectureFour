package exercises.lectureEight.abstraction.abstractclass;

public abstract class Animal {

    //Abstract methods (does not have a body)
    //cannot create objects from Abstract method in main method
    public abstract void animalSound();

    public abstract void move(); //класовете наследници предоставят имплементацията - боди

    //Regular method
    public void sleep(){
        System.out.println("ZzZ");
    }
}
