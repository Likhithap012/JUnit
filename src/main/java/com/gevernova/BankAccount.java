package com.gevernova;

public class BankAccount {
    int balance;
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
}
