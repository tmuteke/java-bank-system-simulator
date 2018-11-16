package accounts;

public class CurrentAccount extends BankAccount {
    private String chequeBookNumber;
    private final double MIN_BALANCE_LIMIT = 0.00d;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "CA";
    }

    public String getChequeBookNumber() {
        return chequeBookNumber;
    }

    public void setChequeBookNumber(String chequeBookNumber) {
        this.chequeBookNumber = chequeBookNumber;
    }

    public double withdraw(double withdraw) throws InvalidWithdrawalException {
        double balance = getBalance();
        if ((balance-withdraw)>MIN_BALANCE_LIMIT) {
            setBalance(balance);
        } else {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        }
        return getBalance();
    }

    public void applyMonthlyCharges() {
        double balance = getBalance();
        balance -= 4.50d;
        setBalance(balance);
    }
}
