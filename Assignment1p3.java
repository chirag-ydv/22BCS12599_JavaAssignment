import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }
}

public class Assignment1p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);
        System.out.print("Deposit: ");
        account.deposit(sc.nextDouble());
        System.out.print("Withdraw: ");
        account.withdraw(sc.nextDouble());
    }
}