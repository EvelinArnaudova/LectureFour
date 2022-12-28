package lectureSeven.constructors;

public class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Employee() { //constructor
        System.out.println("Employee is created");
    }

    public Employee(String firstName, String lastName,int birthYear ) { //constructor
        this(); // calling the previous constructor
        this.firstName = firstName; //the calling of the class should be before anything else
        this.lastName = lastName;//this.firstName is the one in the class, not the parameter in the constructor
        this.birthYear = birthYear;
    }

    public Employee(String firstName, String lastName) { //constructor
        this(firstName, lastName, -1);
    }
}
