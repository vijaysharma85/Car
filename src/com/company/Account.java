package com.company;

public class Account {

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    private  long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public  Account()
    {

        this(123,0,"default");
        System.out.println("Empty cosntrotor called");
    }

    public  Account(long accountNumber,double balance,String name)
    {
        this.accountNumber=accountNumber;
        this.balance=0.0;
        this.name="default";
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 1. To allow the customer to deposit funds (this should increment the balance field).

    public void deposit(double amount)
    {

        this.balance+=amount;

        System.out.println("Balance after deposit is "+this.balance);
    }

    public void withdraw(double amount)
    {
        if(this.balance<amount){
            System.out.println("Insufficent balance is Account");
        }
        else
        this.balance-=amount;

        System.out.println("Balance after Withdraw is "+this.balance);
    }
}
