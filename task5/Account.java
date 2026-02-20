import java.util.ArrayList;

class Account {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;
    protected ArrayList<String> transactionHistory;

    // Constructor
    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + balance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Show Transaction History
    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
