package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account vijay = new Account();
        Account namu = new Account(123,0.0,"namu");

        vijay.deposit(100);

        vijay.deposit(101.1);

        namu.deposit(103.5);

        System.out.println("Vijay balance After Deposit is "+vijay.getBalance());

        System.out.println("NAmu balance is "+namu.getBalance());

        vijay.withdraw(300);

        System.out.println("Vijay balance After Withdrwal is "+vijay.getBalance());

        vijay.withdraw(10);

        System.out.println("Vijay balance After Withdrwal is "+vijay.getBalance());


        VipCustomer anurag = new VipCustomer();

        System.out.println("Customer records is "+anurag.getName() +" " + anurag.getEmail() );

    }
}
