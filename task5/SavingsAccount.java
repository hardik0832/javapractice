class SavingsAccount extends Account {

    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    // Method Overriding
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance - 500) {  // Minimum balance rule
            balance -= amount;
            transactionHistory.add("Withdrawn (Savings): " + amount);
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Minimum balance of 500 must be maintained!");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactionHistory.add("Interest Added: " + interest);
        System.out.println("Interest Added Successfully!");
    }
}