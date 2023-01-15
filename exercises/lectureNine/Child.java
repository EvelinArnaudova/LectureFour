package exercises.lectureNine;

public class Child extends Person{
    public Child(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, language, null , nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello,child");
    }

    @Override
    public void isAdult() {
        System.out.println("This person is a child");
    }

    @Override
    public boolean canTakeLoan(){
        System.out.println("This person is under age and cannot take loans");
        return false;
    }

    public void goToSchool(){
        System.out.println("I'm a student");
    }
}
