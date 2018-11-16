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

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("777200");
        CurrentAccount currentAccount = new CurrentAccount("999300");
        savingsAccount.deposit(250.00d);
        currentAccount.deposit(250.00d);

        System.out.println(savingsAccount.getBalance());
        System.out.println(currentAccount.getBalance());

//        savingsAccount.withdraw(750);
        try {
            savingsAccount.withdraw(300);
            currentAccount.withdraw(450);
        } catch (InvalidWithdrawalException e) {
            e.getMessage();
        }

        Date dob1 = new Date();
        Customer customer1 = new Customer("Customer 1", dob1, "632045287W18");

        SavingsAccount sa1 = new SavingsAccount("8885983");
        SavingsAccount sa2 = new SavingsAccount("8583858");
        CurrentAccount ca1 = new CurrentAccount("7924824");
        Customer customer2 = new Customer("Customer 2", dob1, "989248924899");

        customer2.setSavingsAccount(sa1);
        customer2.setSavingsAccount(sa2);
        customer2.setCurrentAccount(ca1);
        sa1.deposit(200);
        sa2.deposit(200);
        ca1.deposit(200);

        Bank bank = new Bank();
        Object[] bankCustomers = {customer1, customer2};
        bank.setCustomers(bankCustomers);
        bank.getCustomers();

        System.out.println(
            "Name: " + customer1.getName()
            + "\nDate of Birth: " + customer1.getDateOfBirth()
            + "\nNational ID: " + customer1.getNatIdNumber()
            + "\nNet Worth: " + customer1.getNetWorth()
            + "\nCustomer Accounts: " + customer1.getCustomerAccounts()
            + "\nBank Customers" + bank.getCustomers()
        );
    }
}
