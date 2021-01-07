package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(10);
        cashMachine1.addTransaction(3);
        cashMachine1.addTransaction(-50);

        System.out.println(cashMachine1.getPayments());
        System.out.println(cashMachine1.getWithdraws());
        System.out.println(cashMachine1.getNumberOfPayments());
        System.out.println(cashMachine1.getNumberOfWithdraws());

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-1000);
        cashMachine2.addTransaction(100);
        cashMachine2.addTransaction(50);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(70);
        cashMachine3.addTransaction(-20);
        cashMachine3.addTransaction(400);

        Bank bank = new Bank();
        bank.addCashmachine(cashMachine1);
        bank.addCashmachine(cashMachine2);
        bank.addCashmachine(cashMachine3);

        System.out.println(bank.getBankBalance());

        System.out.println(bank.getNumberOfWithdraws());


        System.out.println(bank.getNumberOfPayments());

        System.out.println("Sum of payments: " + bank.getSumOfPayments());

        System.out.println("Sum of withdraws: " + bank.getSumOfWithdraws());

        System.out.println("Average of payments: " + bank.getAverageOfPayments());

        System.out.println("Average of withdraws: " + bank.getAverageOfWithdraws());

    }
}
