import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount acc = new SavingsAccount("Hardik", 1001, 5000);

        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    acc.addInterest();
                    break;

                case 5:
                    acc.showTransactionHistory();
                    break;

                case 6:
                    System.out.println("Thank You for Using Our Bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}