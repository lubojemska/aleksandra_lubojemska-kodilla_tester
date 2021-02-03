package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", delimiter = Character.LINE_SEPARATOR)
    public void ShouldThrowInvalidNumberException(String row) throws InvalidNumbersException {
        String[] rowSplit = row.split(",");

        Set<Integer> set = new HashSet<Integer>();
        for (String s: rowSplit) {
            set.add(Integer.parseInt(s));
        }
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(set));
    }

}

