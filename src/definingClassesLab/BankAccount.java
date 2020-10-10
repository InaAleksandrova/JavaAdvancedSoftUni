package definingClassesLab;

public class BankAccount {
    private static int currentId = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;
    private double interest;

    public BankAccount() {
        this.id = currentId++;
        this.interest = interestRate;
    }

    private static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public double getInterest(int years) {
        return this.balance * years * interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
