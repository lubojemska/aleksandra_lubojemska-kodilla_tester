package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cashMachine1, cashMachine2, cashMachine3;
    Bank bank;

    public BankTestSuite() {
        cashMachine1 = new CashMachine();
        cashMachine2 = new CashMachine();
        cashMachine3 = new CashMachine();

        cashMachine1.addTransaction(20);
        cashMachine1.addTransaction(-90);

        cashMachine2.addTransaction(50);
        cashMachine2.addTransaction(-10);

        cashMachine3.addTransaction(200);
        cashMachine3.addTransaction(-40);

        bank = new Bank();
        bank.addCashmachine(cashMachine1);
        bank.addCashmachine(cashMachine2);
        bank.addCashmachine(cashMachine3);
    }

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddThreeCashMachines() {
        assertEquals(3, bank.getCashMachines().length);
        assertEquals(cashMachine1, bank.getCashMachines()[0]);
        assertEquals(cashMachine2, bank.getCashMachines()[1]);
        assertEquals(cashMachine3, bank.getCashMachines()[2]);

    }

    @Test
    public void shouldCalculateBalance() {
     assertEquals(130, bank.getBankBalance(), 0.001);

    }

    @Test
    public void shouldCalculateNumberOfWithdraws() {
        assertEquals(3, bank.getNumberOfWithdraws());
    }

    @Test
    public void shouldCalculateNumberOfPayments() {
        assertEquals(3, bank.getNumberOfPayments());
    }

    @Test
    public void shouldCalculateSumOfWithdraws() {
        assertEquals(-140, bank.getSumOfWithdraws());
    }

    @Test
    public void shouldCalculateSumOfPayments() {
        assertEquals(270, bank.getSumOfPayments());
    }

    @Test
    public void shouldCalculateAverageOfWithdraws() {

        assertEquals(-46.666, bank.getAverageOfWithdraws(), 0.001);
    }

    @Test
    public void shouldCalculateAverageOfPayments() {
        assertEquals(90.000, bank.getAverageOfPayments(), 0.001);
    }

}
