package exercises.lectureNine;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String sex; //throw exception if not correct // if wrong sex provided print msg
    private String religion;
    private String language;
    private String job; //can change the value
    private String nationality;
    private long egn; //10 digits // throw exception if not correct
    private String dateOfBirth; // with EGN
    public int age; // with EGN
    private String country; //can change the value

    public static Person GetPerson(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        if (nationality == "bulgarian") {
            return  new Bulgarian(name, sex, religion, language, job, nationality, egn, country);
        } else if (nationality == "italian") {
            return  new Italian(name, sex, religion, language, job, nationality, egn, country);
        } else {
            return  new American(name, sex, religion, language, job, nationality, egn, country);
        }
    }

    public Person(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        this.name = name;
        this.religion = religion;
        this.language = language;
        this.job = job; // public
        this.nationality = nationality;
        this.egn = egn;
        this.country = country; //public
        setEgn(egn); // must be called first because it sets the format
        setDateOfBirth(egn);
        setAge(egn);
        setSex(sex);
    }
    //81 07 23 3560
    private void setAge(long egn) {
        String dateOfBirth = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        Integer.parseInt(dateOfBirth);

        this.age = currentYear - Integer.parseInt(dateOfBirth);
    }

    private void setDateOfBirth(long dateOfBirth) {
        // 07/23
        String date = Long.toString(egn).substring(4,6);
        String month = Long.toString(egn).substring(2,4);

        this.dateOfBirth = month + "/" + date;
    }

    private void setEgn(long egn) {
        int egnLength = Long.toString(egn).length();
        if (egnLength == 10) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not valid");
        }
    }

    private void setSex(String sex) {
        String male = "Male";
        String female = "Female";
        if (sex.equalsIgnoreCase(male)|| sex.equalsIgnoreCase(female)){
            this.sex = sex;
        }else {
            throw new RuntimeException("The provided sex is non-existing");
        }
    }

    public abstract void sayHello();/*{
        switch(this.language.toLowerCase()) {
            case "bulgarian":
                System.out.println("Здравейте");
                break;

            case "italian":
                System.out.println("Ciao");
                break;

            default:
                System.out.println("Hello ");
        }
    }*/

    public void celebrateEaster(){
        String orthodox = "Orthodox";
        String catholic = "Catholic";
        String islam = "Islam";

        if (religion.equalsIgnoreCase(orthodox) || religion.equalsIgnoreCase(catholic)){
            System.out.println("Happy Easter!");
        } else if (religion.equalsIgnoreCase(islam)){
            System.out.println("Easter is not celebrated by muslims");
        }
    }

    public abstract void isAdult();/*{
        boolean result = false;

        switch(this.country.toLowerCase()) {
            case "bulgaria":
            case "italia":
                result = this.age >= 18;
                break;

            case "usa":
                result = this.age >= 21;
                break;

            default:
                System.out.println("This country is unrecognized");

        }
        System.out.println("Is this person an adult : " + result);
    return  result;
    }*/

    public boolean canTakeLoan(){
        return job != null;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private void validateSex(String sex) throws Exception {
        String male = "Male";
        String female = "Female";

        if (!sex.equalsIgnoreCase(male) && !sex.equalsIgnoreCase(female)) {
            throw new Exception("Please provide a valid value for sex. Valid options are 'male' or 'female'");
        }
    }

}
