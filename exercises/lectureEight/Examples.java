package exercises.lectureEight;

public class Examples {
    public static void main (String[] args){
    testClassMethods();
    }
    static void testObjectCreation(){
        ClassExample myObject = new ClassExample();
        System.out.println(myObject.x); //accessing attributes with .x, but they should not be private
    }

    static void testModifyClassAttributes(){
        ClassExample myObject = new ClassExample();
        myObject.x = 30;
        System.out.println(myObject.x);

        ClassExample myObject2 = new ClassExample();
        myObject2.x = 20;
        System.out.println(myObject2.x);

        ClassExample myObject3 = new ClassExample();
        System.out.println(myObject3.x);
    }

    static void testFinalAttributes(){
        ClassExample myObject = new ClassExample();
        //myObject.z = 30 //this is now allowed because z is final in class ClassExample
        System.out.println(myObject.z);
    }

    static void testClassMethods(){
   // ClassExample.printHello();
    ClassExample myObject = new ClassExample(10);
    ClassExample myObject1 = new ClassExample(20);
    //myObject.printHelloObject();
    }

}
