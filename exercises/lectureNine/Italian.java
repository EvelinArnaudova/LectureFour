package exercises.lectureNine;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, language, job, nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao");
    }

    @Override
    public void isAdult() {
        boolean result = this.age >= 24;
        System.out.println("Is this person an adult : " + result);
    }

    public void celebrateRegatta (){
        System.out.println("I celebrate Regatta Festival in July ");
    }
}
