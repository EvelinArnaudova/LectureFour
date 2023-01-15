package exercises.lectureNine;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, language, job, nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте");
    }

    @Override
    public void isAdult() {
        boolean result = this.age >=18;
        System.out.println("Is this person an adult : " + result);
    }

    public void celebrateBabaMarta(){
        System.out.println("I celebrate Baba Marta on 1st of March");
    }
}
