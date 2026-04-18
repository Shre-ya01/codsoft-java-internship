import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Transaction failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Please collect cash.");
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }
}


// ATM Class
class ATM {
    private BankAccount account;
    private Scanner sc;

    ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    // Display Menu
    void showMenu() {
        int option;

        do {
            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    handleDeposit();
                    break;

                case 2:
                    handleWithdraw();
                    break;

                case 3:
                    System.out.println("Available Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Session ended. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);
    }

    // Deposit handling
    private void handleDeposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    // Withdraw handling
    private void handleWithdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}


// Main Class
public class Task3_ATM {
    public static void main(String[] args) {

        // Create account with initial balance
        BankAccount userAccount = new BankAccount(1000);

        // Connect ATM with account
        ATM atmMachine = new ATM(userAccount);

        // Start ATM
        atmMachine.showMenu();
    }
}