package multiplethreads;

public class BankAccount {
    int balance = 10000;

    synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining: " + balance);
        } else {
            System.out.println(name + " cannot withdraw. Not enough balance.");
        }
    }
}
