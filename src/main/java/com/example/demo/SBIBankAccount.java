package com.example.demo;
import com.example.demo.Bank;

import java.util.UUID;

public class SBIBankAccount implements Bank {
    //changed

    private int balance;
    // this is a change
    private String name;
    private int roi;
    private String password;
    private String accountNumber;

    public SBIBankAccount() {
        this.balance = 0;
        this.name = "";
        this.password = "";
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public SBIBankAccount(int balance, String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(this.balance < money){
            return false;
        }
        this.balance -= money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int loanAmount, int timeInYears) {
        return loanAmount * roi * timeInYears / 100;
    }
}
