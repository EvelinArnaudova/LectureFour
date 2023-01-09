package exercises.lectureEight.examples.encapsulation;

public class Examples {
    public static void main (String[] args) {
        BankAccount bankAccount = new BankAccount("Ivan Ivanov");

        bankAccount.setOwnerName("Stoyan");
        bankAccount.setAccountBalance(234.5657766);
        bankAccount.getAccountBalance();

        double balance = bankAccount.getAccountBalance();
        String accNum = bankAccount.getAccountNumber();

        System.out.println(bankAccount.getOwnerName() + "" + balance + "" + accNum);
    }
}
