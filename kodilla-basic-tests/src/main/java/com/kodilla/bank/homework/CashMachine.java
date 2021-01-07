package com.kodilla.bank.homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CashMachine {

    private double[] transactions;

    public CashMachine() {
        this.transactions = new double[0];
    }

    public void addTransaction(double value) {
        if (value != 0 ) {
            double[] temp = new double[this.transactions.length + 1];
            System.arraycopy(this.transactions, 0, temp, 0, this.transactions.length);
            temp[temp.length - 1] = value;
            transactions = temp;
        }

    }

    public double[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        double sumTransactions = 0;
        for (int i = 0; i < transactions.length; i++) {
          sumTransactions += transactions[i];
        }
        return sumTransactions;
    }

    public double getPayments() {
        double sumPayments = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sumPayments += transactions[i];
            }
        }
        return sumPayments;
    }

    public int getNumberOfPayments() {
        int total = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                total += 1;
            }
        }
        return total;

    }

    public int getNumberOfWithdraws() {
        int total = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                total += 1;
            }
        }
        return total;
    }

    public double getWithdraws() {
        double sumWithdraws = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sumWithdraws += transactions[i];
            }
        }
        return sumWithdraws;
    }

}
