package exercises.lectureEight;

public class ClassExample {
    int x = 5; //attributes
    int y = 9;
    final int z = 10;

    public ClassExample(int x){
        this.x = x;
        printHelloObject();
    }

    public ClassExample() {
        printHelloObject();
    }

    public static void printHello(){
        System.out.println("Hello. this method can be called WITHOUT creating object of class ClassExample");
    }

    public void printHelloObject(){
        System.out.println("Hello. this method can be called only if you create an object of class ClassExample");
        System.out.println("Non-static variables as x can be accessed ONLY by non-static (object) methods");
        System.out.println("The value of x is: " + this.x + " The value of x is accessed by method printHelloObject");
    }
}
