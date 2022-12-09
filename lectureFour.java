import java.util.Scanner;
import java.util.Objects;
public class lectureFour {
    public static void main(String[] args) {

    }

    public static void DaysOfWeek() {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("The " + i + "-st day of the week is Monday  ");
                break;
            case 2:
                System.out.println("The " + i + "-nd day of the week is Tuesday  ");
                break;
            case 3:
                System.out.println("The " + i + "-rd day of the week is Wednesday ");
                break;
            case 4:
                System.out.println("The " + i + "-th day of the week is Thursday ");
                break;
            case 5:
                System.out.println("The " + i + "-th day of the week is Friday ");
                break;
            case 6:
                System.out.println("The " + i + "-th day of the week is Saturday ");
                break;
            case 7:
                System.out.println("The " + i + "-th day of the week is Sunday ");
                break;
            default:
                System.out.println("There is not such day " + i);
        }
    }

    public static void EnterAge(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 16) {
            System.out.println("You are eligible to work ");
        } else {
            System.out.println("You are not eligible to work");
        }
    }

    public static void CalculateRevenue(){
        Scanner input = new Scanner(System.in);
        float percentage15 = 0.15F;
        float percentage20 = 0.2F;
        float unitPrice = 25.0F;
        //int prodQty;
        System.out.print("Enter product qty: ");
        int prodQty = input.nextInt();
        System.out.println("Enter the price of one unit: ");
        unitPrice = input.nextFloat();
        float totalPrice = unitPrice * (float)prodQty;
        float totalDiscount = 0.0F;
        if (prodQty >= 100 && prodQty <= 120) {
            totalDiscount = totalPrice * percentage15;
        } else if (prodQty > 120) {
            totalDiscount = totalPrice * percentage20;
        } else {
            System.out.println("No discount can be applied to your order");
        }

        System.out.println("The revenue from the sale is: " + (totalPrice - totalDiscount));
        System.out.println("The order discount is: " + totalDiscount);
    }

    public static void FindNumber(){
        int[] largeNum = new int[]{90, 91, 92, 93, 94};

        for(int i = 4; i < largeNum.length; ++i) {
            System.out.println(largeNum[i]);
        }
    }

    public static void EnterVacation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a destination: ");
        String destination = input.nextLine();
        System.out.print("Enter your budget per day: ");
        int budgetPerDay = input.nextInt();
        if (Objects.equals(destination.toLowerCase(), "beach")) {
            if (budgetPerDay < 50) {
                System.out.println("The best vacation for you will be in BG on the beach.");
            } else {
                System.out.println("The best vacation for you will be outside BG on the beach.");
            }
        } else if (Objects.equals(destination.toLowerCase(), "mountain")) {
            if (budgetPerDay < 30) {
                System.out.println("The best vacation for you will be in BG in the mountain.");
            } else {
                System.out.println("The best vacation for you will be outside BG in the mountain");
            }
        } else {
            System.out.println("There is no vacation applicable to your budget");
        }
    }

    public static void IsItDividable() {
        int[] myNumber = new int[]{12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < myNumber.length && myNumber[i] <= 150; ++i) {
            if (myNumber[i] % 5 == 0) {
                System.out.println(myNumber[i]);
            }
        }
    }

    public static void ReverseNumbers(){
        int[] reverseArray = new int[]{10, 20, 30, 40, 50};
        System.out.println("Reverse numbers of the array: ");

        for(int i = reverseArray.length - 1; i >= 0; --i) {
            System.out.println(reverseArray[i] + " ");
        }
    }
}