package accounts;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber + getAccountType();
        balance = 0.00;
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

    void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public abstract void withdraw(double withdraw) throws InvalidWithdrawalException;

    public abstract void applyMonthlyCharges();

    @Override
    public String toString() {
        return accountNumber;
    }
}
