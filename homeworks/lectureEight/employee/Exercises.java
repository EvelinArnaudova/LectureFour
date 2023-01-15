package homeworks.lectureEight.employee;

public class Exercises {
    public static void main(String[] args) {
        Employee employee = new Employee(2, "Evelin", "Arnaudova", 202.23);

        String name = employee.getName();
        double annualSalary = employee.getAnnualSalary();
        System.out.println(employee);

        double raisedSalary = employee.raiseSalary(-10);
        annualSalary = employee.getAnnualSalary();
        System.out.println(employee);
    }

}