package customers;

import accounts.BankAccount;

import java.util.*;

public class Customer {
    private String name;
    private Date dateOfBirth;
    private String email;
    private String mobileNumber;
    private String natIdNumber;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNatIdNumber() {
        return natIdNumber;
    }

    public void setNatIdNumber(String natIdNumber) {
        this.natIdNumber = natIdNumber;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void setAccounts(BankAccount... accounts) {
        Collections.addAll(this.accounts, accounts);
    }

    @Override
    public String toString() {
        return name;
    }
}
