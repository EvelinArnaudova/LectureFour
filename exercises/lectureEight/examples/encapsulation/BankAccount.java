package exercises.lectureEight.examples.encapsulation;

import java.util.Date;
import java.util.Random;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    BankAccount(String name) {
        this.ownerName = name;
        name = name.replace("", ""); //.replace is removing all white spaces
        setAccountNumber(name);
    }

    BankAccount(String name, double transaction) {
        this.accountBalance = this.accountBalance + transaction;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (this.ownerName == null) //ако няма създадено име, да бъде въведено. Ако е null ще го промени на Стоян със сетъра
            this.ownerName = ownerName; // ако има създадено, да не го променя
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void setAccountNumber(String name) {
        Date d = new Date();
        Random r = new Random();
        this.accountNumber = name + d.getTime() + r.nextInt();
    }

    public void makeTransaction (double transaction) {
        this.accountBalance = this.accountBalance + transaction;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance > 0) {
            this.accountBalance = accountBalance;
        }
    }
}
