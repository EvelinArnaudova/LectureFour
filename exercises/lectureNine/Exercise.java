package exercises.lectureNine;
import exercises.lectureNine.Person;
public class Exercise {
    public static void main(String[] args){

        Person bulgarian = Person.GetPerson("Ivana", "female", "orthodox", "bulgarian", "QA", "bulgarian", 9204236677l,"USA");
        Person italian = Person.GetPerson("Martin", "male", "orthodox", "italian","no job", "italian", 9904056677l, "Italia");
        Person american = Person.GetPerson("John", "male", "orthodox", "english", "police man", "american", 6708054433l,"USA");



    }
}
