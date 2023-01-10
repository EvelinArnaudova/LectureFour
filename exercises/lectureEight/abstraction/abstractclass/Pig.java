package exercises.lectureEight.abstraction.abstractclass;

import exercises.lectureEight.abstraction.abstractclass.Animal;

public class Pig extends Animal {
    @Override
    public void animalSound(){
        //the body of the abstract method animalSound() is provided here
        System.out.println("The pig says Wee wee");
    }

    @Override
    public void move(){
        System.out.println("Walking on four legs");
    }
}
