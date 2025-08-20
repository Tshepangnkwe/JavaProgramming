/**
 * BankAccount class - Practical example of encapsulation and methods
 * This demonstrates:
 * - Data encapsulation (private fields)
 * - Constructor overloading
 * - Input validation
 * - Business logic methods
 * - State management
 * 
 * TODO: Study this class and implement the suggested enhancements
 */
public class BankAccount {
    // Private instance variables (encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private boolean isActive;
    private int transactionCount;
    
    // Class constants
    private static final double MINIMUM_BALANCE = 0.0;
    private static final double OVERDRAFT_LIMIT = -500.0;
    private static final int TRANSACTION_LIMIT = 10;
    
    // Default constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
        this.accountType = "Savings";
        this.isActive = true;
        this.transactionCount = 0;
    }
    
    // Constructor with account holder name
    public BankAccount(String accountHolderName) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.accountType = "Savings";
        this.isActive = true;
        this.transactionCount = 0;
    }
    
    // Constructor with name and initial balance
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, MINIMUM_BALANCE);
        this.accountType = "Savings";
        this.isActive = true;
        this.transactionCount = 0;
    }
    
    // Full constructor
    public BankAccount(String accountHolderName, double initialBalance, String accountType) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, MINIMUM_BALANCE);
        this.accountType = accountType != null ? accountType : "Savings";
        this.isActive = true;
        this.transactionCount = 0;
    }
    
    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
    
    // Setter methods with validation
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        }
    }
    
    public void setAccountType(String accountType) {
        if (accountType != null && (accountType.equals("Savings") || 
                                   accountType.equals("Checking") || 
                                   accountType.equals("Business"))) {
            this.accountType = accountType;
        }
    }
    
    // Business logic methods
    public boolean deposit(double amount) {
        if (!isActive) {
            System.out.println("Cannot deposit to inactive account.");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
        
        if (transactionCount >= TRANSACTION_LIMIT) {
            System.out.println("Transaction limit reached for today.");
            return false;
        }
        
        balance += amount;
        transactionCount++;
        System.out.printf("Deposited $%.2f. New balance: $%.2f\n", amount, balance);
        return true;
    }
    
    public boolean withdraw(double amount) {
        if (!isActive) {
            System.out.println("Cannot withdraw from inactive account.");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        
        if (transactionCount >= TRANSACTION_LIMIT) {
            System.out.println("Transaction limit reached for today.");
            return false;
        }
        
        // Check if withdrawal would exceed overdraft limit
        if (balance - amount < OVERDRAFT_LIMIT) {
            System.out.printf("Insufficient funds. Overdraft limit is $%.2f\n", 
                            Math.abs(OVERDRAFT_LIMIT));
            return false;
        }
        
        balance -= amount;
        transactionCount++;
        
        if (balance < 0) {
            System.out.printf("Withdrew $%.2f. New balance: $%.2f (OVERDRAFT)\n", 
                            amount, balance);
        } else {
            System.out.printf("Withdrew $%.2f. New balance: $%.2f\n", amount, balance);
        }
        
        return true;
    }
    
    public boolean transfer(BankAccount targetAccount, double amount) {
        if (this.withdraw(amount)) {
            if (targetAccount.deposit(amount)) {
                System.out.printf("Transferred $%.2f to account %s\n", 
                                amount, targetAccount.getAccountNumber());
                return true;
            } else {
                // Rollback the withdrawal if deposit fails
                this.balance += amount;
                this.transactionCount--;
                System.out.println("Transfer failed. Deposit to target account unsuccessful.");
                return false;
            }
        }
        return false;
    }
    
    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Current Balance: $%.2f\n", balance);
        System.out.println("Account Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Transactions Today: " + transactionCount + "/" + TRANSACTION_LIMIT);
        
        if (balance < 0) {
            System.out.println("⚠️  OVERDRAFT ACCOUNT");
        } else if (balance < 100) {
            System.out.println("⚠️  LOW BALANCE WARNING");
        }
        System.out.println("===========================");
    }
    
    public void applyInterest(double interestRate) {
        if (balance > 0) {
            double interest = balance * (interestRate / 100);
            balance += interest;
            System.out.printf("Applied %.2f%% interest: $%.2f. New balance: $%.2f\n", 
                            interestRate, interest, balance);
        }
    }
    
    public void closeAccount() {
        if (balance != 0) {
            System.out.println("Cannot close account with non-zero balance.");
            return;
        }
        
        isActive = false;
        System.out.println("Account " + accountNumber + " has been closed.");
    }
    
    public void reopenAccount() {
        isActive = true;
        transactionCount = 0;
        System.out.println("Account " + accountNumber + " has been reopened.");
    }
    
    public void resetDailyTransactions() {
        transactionCount = 0;
        System.out.println("Daily transaction count reset.");
    }
    
    public boolean hasOverdraft() {
        return balance < 0;
    }
    
    public double getAvailableBalance() {
        return Math.max(balance - OVERDRAFT_LIMIT, 0);
    }
    
    // Static method to generate account number
    private static String generateAccountNumber() {
        return "ACC" + System.currentTimeMillis() % 1000000;
    }
    
    // Static method to compare two accounts
    public static BankAccount getAccountWithHigherBalance(BankAccount account1, BankAccount account2) {
        return account1.getBalance() >= account2.getBalance() ? account1 : account2;
    }
    
    @Override
    public String toString() {
        return String.format("BankAccount[%s, %s, $%.2f, %s]", 
                           accountNumber, accountHolderName, balance, 
                           isActive ? "Active" : "Inactive");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Bank Account System Demo ===");
        
        // Create different types of accounts
        BankAccount account1 = new BankAccount("Alice Johnson", 1000.0, "Savings");
        BankAccount account2 = new BankAccount("Bob Smith", 500.0, "Checking");
        BankAccount account3 = new BankAccount("Charlie Brown");
        
        // Display initial account information
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();
        
        // Perform transactions
        System.out.println("\n=== Transaction Testing ===");
        account1.deposit(250.0);
        account1.withdraw(100.0);
        account1.withdraw(2000.0); // Should fail due to overdraft limit
        
        account2.deposit(300.0);
        account1.transfer(account2, 150.0);
        
        // Apply interest
        System.out.println("\n=== Interest Application ===");
        account1.applyInterest(2.5); // 2.5% interest
        account2.applyInterest(1.8); // 1.8% interest
        
        // Final account states
        System.out.println("\n=== Final Account States ===");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();
        
        // Compare accounts
        BankAccount richerAccount = BankAccount.getAccountWithHigherBalance(account1, account2);
        System.out.println("\nAccount with higher balance: " + richerAccount);
        
        System.out.println("\n=== Practice Exercises ===");
        System.out.println("Try implementing these features:");
        System.out.println("1. Transaction history (store last 10 transactions)");
        System.out.println("2. Monthly fee deduction");
        System.out.println("3. Different interest rates for different account types");
        System.out.println("4. Minimum balance requirements");
        System.out.println("5. Account statement generation");
        System.out.println("6. PIN/password protection");
        System.out.println("7. Currency conversion methods");
    }
}
