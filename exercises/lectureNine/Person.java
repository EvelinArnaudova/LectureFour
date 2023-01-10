package exercises.lectureNine;

import java.time.LocalDate;

public class Person {
    private String name;
    private String sex; //throw exception if not correct // if wrong sex provided print msg
    private String religion;
    private String language;
    private String job; //can change the value
    private String nationality;
    private long egn; //10 digits // throw exception if not correct
    private String dateOfBirth; // with EGN
    private int age; // with EGN
    private String country; //can change the value

    public Person(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = egn;
       // this.dateOfBirth = setDateOfBirth();
       // setAge(egn);
        this.country = country;
    }
    //
    private void setAge(int egn) {
        String dateOfBirth = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();

        Integer.parseInt(dateOfBirth);

        this.age = currentYear - Integer.parseInt(dateOfBirth);
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
// по аналогичен начин, но трябва да вземем другите 4 цифри
    // nteger kum String


}
