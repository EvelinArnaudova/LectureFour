import java.util.Scanner;

public class lectureSix {

    public static void main(String[]args){

        /*int num = findSmallestNumber(5,7,3);
    num = findSmallestNumber(5,6,1);*/

        //double num = computeAverageNumber(3.4,5.6,7.8);

        /*String str = "cake";
        str = printMidChar("cake");*/

        /*String word = "Hello, how are you?";
        countWords("Hello, how are you?");*/

        //isEven(6);

    }

    public static int findSmallestNumber(int num1, int num2, int num3){
        int smallestNumber = num1; //this can be changed

        if (smallestNumber>num2){
            smallestNumber=num2; // if this is true num1>num2
        }
        if (smallestNumber>num3){
            smallestNumber=num3; //if this is true then num3<num1, num2
        }
        return smallestNumber;
    }

    public static double computeAverageNumber (double num1, double num2, double num3){
        return (num1+num2+num3) / 3;
    }

    public static String printMidChar(String str){
        int position, length;
        int len = str.length(); // Finding string length
        int middle = len/2; // Finding the middle of the String

        if(len % 2 == 0) { // if the number is odd
            position = middle -1;
            length = 2;
        }
        else
        {
            position = middle; // if the number is even
            length=1;
        }
        return str.substring(position, position + length);
    }

    public static int countWords (String word){
        word = word.trim(); //This method may be used to trim space from the beginning and end of a string.
        int count = 0;
        int textLength = word.length(); //all characters + spaces + symbols

        if (textLength > 1) {
            count++; //After trim() the text will always start with a word

            for (int i = 1; i < textLength; i++) {
                if (word.charAt(i) == ' ') { //the char value at the specified index of this string
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isEven(int num) {
        return num % 2==0;
    }

    public static boolean checkIfPalindrome(){
        int remainder;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");

        int num = scanner.nextInt();

        if (num >= 0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        } else {
            System.out.println("The integer must be non-negative!");
            return false;
        }
    }

}


