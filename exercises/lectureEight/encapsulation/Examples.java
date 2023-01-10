package exercises.lectureEight.encapsulation;

public class Examples {
    public static void main (String[] args) {
        BankAccount bankAccount = new BankAccount("Ivan Ivanov");

        bankAccount.setOwnerName("Stoyan");
        bankAccount.setAccountBalance(234.5657766);
        int balance = bankAccount.getAccountBalance();
        System.out.println(balance);

        /*double balance = bankAccount.getAccountBalance();
        String accNum = bankAccount.getAccountNumber();

        System.out.println(bankAccount.getOwnerName() + "" + balance + "" + accNum);*/
    }
}
