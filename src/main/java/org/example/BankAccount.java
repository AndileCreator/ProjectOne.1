package org.example;
//Exercise 4.2: Bank account
//Create a BankAccount class with private fields for account holder, account number, and balance.
//Add a constructor and methods: - deposit(double amount) - withdraw(double amount) - getBalance()
//A deposit or withdrawal must be greater than zero. A withdrawal cannot exceed the balance.
//Invalid operations must not change the balance. Test valid and invalid transactions.

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String _accountHolder, String _accountNumber, double _balance) {
        this.accountHolder = _accountHolder;
        this.accountNumber = _accountNumber;
        this.balance = _balance;
        }

    public void deposit(double _amount) {
        if  (_amount > 0) {
        this.balance += _amount;
        System.out.println("Amount deposited is: " + "R" + _amount);
        } else {
            System.out.println("No funds deposited");
        }
    }
    public void withdraw(double _amount) {
        if (_amount < balance){
            this.balance -= _amount;
            System.out.println("Amount withdraw is: " + "R" + _amount);
        } else{
            System.out.println("Insufficient funds!");
        }
    }

    public void getBalance() {
        System.out.println("The balance is: " + this.balance);
    }
}
