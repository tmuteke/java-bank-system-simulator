package bank;

import accounts.BankAccount;
import accounts.CurrentAccount;
import accounts.InvalidWithdrawalException;
import accounts.SavingsAccount;
import customers.Customer;

import java.util.*;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();

    private ArrayList<Customer> getCustomers() {
        return customers;
    }

    private void setCustomers(Customer... customers) {
        Collections.addAll(this.customers, customers);
    }

    private void applyMonthlyChargeForCustomer(Customer customer) {
        for (BankAccount bankAccount : customer.getAccounts()) {
            bankAccount.applyMonthlyCharges();
        }
    }

    private double calculateBankTotalSavingsBalances() {
        double balance = 0.00;
        for (Customer customer : customers) {
            for (BankAccount bankAccount : customer.getAccounts()) {
                if (bankAccount instanceof SavingsAccount) {
                    balance += bankAccount.getBalance();
                }
            }
        }
        return balance;
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

        sa1.deposit(450);
        sa2.deposit(500);

        customer2.setAccounts(sa1, sa2, ca1);

        System.out.println(
                "Customer Name: " + customer2.getName()
                + "\nAccounts Held: " + customer2.getAccounts()
        );

        Bank myBank = new Bank();
        myBank.setCustomers(customer1, customer2);

        for (BankAccount bankAccount : customer1.getAccounts()) {
            System.out.println(bankAccount.getBalance());
        }

        myBank.applyMonthlyChargeForCustomer(customer1);

        for (BankAccount bankAccount : customer1.getAccounts()) {
            System.out.println(bankAccount.getBalance());
        }

        System.out.println(myBank.getCustomers());
        System.out.println(myBank.calculateBankTotalSavingsBalances());

        System.out.println(customer1);
    }
}
