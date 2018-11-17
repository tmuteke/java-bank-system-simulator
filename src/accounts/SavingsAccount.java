package accounts;

public class SavingsAccount extends BankAccount {
    private double interestRateMode;
    private final double MIN_BALANCE_LIMIT = 5.00d;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "SA";
    }

    public double getInterestRateMode() {
        return interestRateMode;
    }

    public void setInterestRateMode(double interestRateMode) {
        this.interestRateMode = interestRateMode;
    }

    public double withdraw(double withdraw) throws InvalidWithdrawalException {
        double balance = getBalance();
        if ((balance-withdraw)>MIN_BALANCE_LIMIT) {
            setBalance(balance-withdraw);
        } else if (withdraw>5000.00d) {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        } else {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        }
        return getBalance();
    }

    public void applyMonthlyCharges() {
        double balance = getBalance();
        balance -= 2.00d;
        setBalance(balance);
    }
}
