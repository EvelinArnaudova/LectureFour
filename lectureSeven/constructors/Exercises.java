package lectureSeven.constructors;

import lectureSeven.constructors.vehicle.Car;

public class Exercises {
    public static void main(String[] args){
        Car car = new Car("12345", "Audi");
    }

    static Employee createEmployee(){ //here we create one employee
        Employee employee = new Employee();
        return employee;
    }
}
