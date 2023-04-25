package com.example.demo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Bank sbiBankAccount = new SBIBankAccount(1000, "Ujawall", "Pass1234");
        sbiBankAccount.addMoney(100);
        sbiBankAccount.withdrawMoney(1300);
        int balance = sbiBankAccount.checkBalance();

    }



}