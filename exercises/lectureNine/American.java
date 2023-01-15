package exercises.lectureNine;

public class American extends Person {
    public American(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, language, job, nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void isAdult() {
        boolean result = this.age >= 21;
        System.out.println("Is this person an adult : " + result);
    }

    public void celebrateThanksgiving(){
        System.out.println("I celebrate Thanksgiving on 23rd of November");
    }

}
