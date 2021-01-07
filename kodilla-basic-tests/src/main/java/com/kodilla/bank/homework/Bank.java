package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;


    public Bank() {
        cashMachines = new CashMachine[0];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void addCashmachine(CashMachine cashMachine) {
        CashMachine[] newTab = new CashMachine[cashMachines.length + 1];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[newTab.length - 1] = cashMachine;
        cashMachines = newTab;
    }

    public double getBankBalance() {
        double sumBankBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sumBankBalance += cashMachines[i].getBalance();
        }
        return sumBankBalance;
    }

    public int getNumberOfWithdraws() {
        int sumNumberOfWithdraws = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sumNumberOfWithdraws += cashMachines[i].getNumberOfWithdraws();
        }
        return sumNumberOfWithdraws;
    }

    public int getNumberOfPayments() {
        int sumNumberOfPayments = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sumNumberOfPayments += cashMachines[i].getNumberOfPayments();
        }
        return sumNumberOfPayments;
    }

    public double getSumOfPayments() {
        double sumOfPayments = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sumOfPayments += cashMachines[i].getPayments();
        }
        return sumOfPayments;
    }

    public double getSumOfWithdraws() {
        double sumOfWithdraws = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sumOfWithdraws += cashMachines[i].getWithdraws();
        }
        return sumOfWithdraws;
    }

    public double getAverageOfPayments() {
        return getSumOfPayments()/getNumberOfPayments();
    }

    public double getAverageOfWithdraws() {
        return getSumOfWithdraws()/getNumberOfWithdraws();
    }
}
