package homeworks;

import java.util.Scanner;
public class lectureTwo {

    public static void main(String[] args) {

    }
    public static void CreateTriangle(){
        /*static int perimeter(int a; int b; int c) {
            return a + b + c;
        }

        static int area(int a, int b) {
            return (a * b) / 2 ;
        }*/
            int perimeter = (3+4+5);
            int area = (3*4 / 2);
            System.out.println("The perimeter of the triangle is: " + perimeter);
            System.out.println("The area of the triangle is: " + area);
    }

    public static void CalculateTriangle() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the lenght of the opposite side: ");
        int a = myObj.nextInt();
        System.out.println("Enter the lenght of the adjacent side: ");
        int b = myObj.nextInt();
        System.out.println("Enter the lenght of the hypotenuse: ");
        int c = myObj.nextInt();
        //int P = CreateTriangle().perimeter(a, b, c);
        //System.out.println("Perimeter is: " + P);
    }

    public static void PrintName() {
        String firstName = "Evelin";
        String middleName = " Kirilova";
        String familyName = " Arnaudova";

        String fullName = firstName + middleName + familyName;

        System.out.println("Full name is: " + fullName);
    }

    public static void PrintPineTree() {
        // set heihgt

        int height = 5;
        for (int i = 1; i <= height; i++) {

            // prints indentation
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            //prints stars
            for (int star = 1; star <= i * 2 - 1; star++) {
                System.out.print("*");
            }
            //prints new line
            System.out.println();
        }
    }

    public static void CalculateQuadraticEquation(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double d= b * b - 4.0 * a * c;

        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}

