package accounts;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "CA";
    }

    public void withdraw(double withdraw) throws InvalidWithdrawalException {
        double balance = getBalance();
        if ((balance-withdraw)>0.00) {
            setBalance(balance-withdraw);
        } else {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        }
    }

    public void applyMonthlyCharges() {
        double balance = getBalance();
        balance -= 4.50;
        setBalance(balance);
    }
}
