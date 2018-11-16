package accounts;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private final double MAX_WITHDRAWAL_LIMIT = 5000.00d;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber + getAccountType();
        balance = 0.00d;
    }

    public abstract String getAccountType();

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double deposit) {
        balance += deposit;
        return balance;
    }

    public abstract double withdraw(double withdraw) throws InvalidWithdrawalException;

    public abstract void applyMonthlyCharges();
}
