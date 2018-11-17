package bank;

import accounts.CurrentAccount;
import accounts.InvalidWithdrawalException;
import accounts.SavingsAccount;
import customers.Customer;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Bank {
    private Object[] customers;

    public List<Object> getCustomers() {
        return Arrays.asList(customers);
    }

    public void setCustomers(Object[] customers) {
        this.customers = customers;
    }

    public static void main(String[] args) throws InvalidWithdrawalException {
        SavingsAccount savingsAccount = new SavingsAccount("777200");
        CurrentAccount currentAccount = new CurrentAccount("999300");

        savingsAccount.deposit(750);
        currentAccount.deposit(750);

        System.out.println(savingsAccount.getBalance());
        System.out.println(currentAccount.getBalance());

//        savingsAccount.withdraw(750);
        savingsAccount.withdraw(300);
        currentAccount.withdraw(450);

        System.out.println(savingsAccount.getBalance());
        System.out.println(currentAccount.getBalance());

        Customer customer1 = new Customer("Customer 1");

        customer1.setAccounts(savingsAccount, currentAccount);

        System.out.println(
                "Customer Name: " + customer1.getName()
                + "\nAccounts Held: " + customer1.getAccounts()
        );

        SavingsAccount sa1 = new SavingsAccount("999000");
        SavingsAccount sa2 = new SavingsAccount("000999");
        CurrentAccount ca1 = new CurrentAccount("999000");
        Customer customer2 = new Customer("Customer 2");

        customer2.setAccounts(sa1, sa2, ca1);

        System.out.println(
                "Customer Name: " + customer2.getName()
                + "\nAccounts Held: " + customer2.getAccounts()
        );
    }
}
