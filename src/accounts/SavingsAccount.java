package accounts;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getAccountType() {
        return "SA";
    }

    public void withdraw(double withdraw) throws InvalidWithdrawalException {
        double balance = getBalance();
        if ((balance-withdraw)>5.00) {
            setBalance(balance-withdraw);
        } else if (withdraw>5000.00) {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        } else {
            throw new InvalidWithdrawalException("Exceeds withdraw limit");
        }
    }

    public void applyMonthlyCharges() {
        double balance = getBalance();
        balance -= 2.00;
        setBalance(balance);
    }
}
