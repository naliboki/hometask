package lesson6.creditcard;

public class CreditCard {

    String accountNumber;
    double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Баланс: " + balance);
        System.out.println();
    }
}

