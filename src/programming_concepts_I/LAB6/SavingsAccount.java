package programming_concepts_I.LAB6;

public class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
}
