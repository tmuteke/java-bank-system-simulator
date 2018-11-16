package customers;

import accounts.CurrentAccount;
import accounts.SavingsAccount;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private Date dateOfBirth;
    private boolean status;
    private Object[] customerAccounts;
    private String email;
    private String mobileNumber;
    private String natIdNumber;
    private SavingsAccount[] savingsAccounts;
    private CurrentAccount[] currentAccounts;

    public Customer(String name, Date dateOfBirth, String natIdNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.natIdNumber = natIdNumber;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Object> getCustomerAccounts() {
        return Arrays.asList(savingsAccounts, currentAccounts);
    }

    public void setCustomerAccounts(Object[] customerAccounts) {
        this.customerAccounts = customerAccounts;
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

//    public double getNetWorth() {
//        return savingsAccount.getBalance() + currentAccount.getBalance();
//    }
}
