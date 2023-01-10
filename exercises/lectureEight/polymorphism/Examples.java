package exercises.lectureEight.polymorphism;

public class Examples {
    public static void main(String[] args){
        Animal myAnimal = new Animal(); //create a new Object Animal
        Animal myPig = new Pig(); // create a new Object Pig
        Animal myDog = new Dog(); // create a new Object Dog

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
