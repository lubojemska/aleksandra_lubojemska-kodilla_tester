package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getTransactions().length);
    }

    @Test
    public void shouldAddTwoTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(-300);

        assertEquals(2, cashMachine.getTransactions().length);
        assertEquals(10, cashMachine.getTransactions()[0]);
        assertEquals(-300, cashMachine.getTransactions()[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(30);
        cashMachine.addTransaction(60);
        cashMachine.addTransaction(-20);

        assertEquals(70, cashMachine.getBalance());

    }

    @Test
    public void shouldCalculatePayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-60);
        cashMachine.addTransaction(10);

        assertEquals(50, cashMachine.getPayments());
    }

    @Test
    public void shouldCalculateNumberOfPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-60);
        cashMachine.addTransaction(10);

        assertEquals(2, cashMachine.getNumberOfPayments());
    }

    @Test
    public void shouldCalculateWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-60);
        cashMachine.addTransaction(10);

        assertEquals(-60, cashMachine.getWithdraws());
    }

    @Test
    public void shouldCalculateNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-60);
        cashMachine.addTransaction(10);

        assertEquals(1, cashMachine.getNumberOfWithdraws());
    }

}
