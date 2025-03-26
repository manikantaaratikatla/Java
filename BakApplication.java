package myFirstProgram;
import java.util.ArrayList;
import java.util.Scanner;

// BankAccount class
class BankAccount {
    private int accountId;
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(int id, String holderName, double initialBalance) {
        this.accountId = id;
        this.accountHolder = holderName;
        this.balance = initialBalance;
        System.out.println("Bank account created for: " + accountHolder + " (ID: " + accountId + ")");
    }

    // Get Account ID
    public int getAccountId() {
        return accountId;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Account ID: " + accountId + " | Current balance: $" + balance);
    }
}

// Main class
public class BakApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<BankAccount> accounts = new ArrayList<>(); // Dynamic list for accounts

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Search Account by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    performTransaction("deposit");
                    break;
                case 3:
                    performTransaction("withdraw");
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    searchAccount();
                    break;
                case 6:
                    System.out.println("Thank you for using our bank system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    // Create a new account
    private static void createAccount() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = scanner.nextDouble();

        accounts.add(new BankAccount(id, name, initialDeposit)); // Dynamically add account
    }

    // Perform deposit or withdrawal
    private static void performTransaction(String type) {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        BankAccount account = findAccount(id);

        if (account != null) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            if (type.equals("deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Check balance
    private static void checkBalance() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        BankAccount account = findAccount(id);

        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    // Search for an account by ID
    private static void searchAccount() {
        System.out.print("Enter Account ID to search: ");
        int id = scanner.nextInt();
        BankAccount account = findAccount(id);

        if (account != null) {
            System.out.println("Account Found: " + account.getAccountId());
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    // Find an account by ID
    private static BankAccount findAccount(int id) {
        for (BankAccount account : accounts) {
            if (account.getAccountId() == id) {
                return account;
            }
        }
        return null; // Return null if account is not found
    }
}
