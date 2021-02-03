package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"james", "harry13", "gandalf-the-whiteAA", "bbb"})
    public void shouldReturnTrueIfNameValidate(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfNameIsEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"a" , "| ) |", " x#300 "})
    public void shouldReturnFalseIfNameNotValidate(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"bb", "y", "7"})
    public void shouldReturnFalseIfNameIsShorterThanThreeChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"name@mail.com", "harry-13@info.info", "gandalf@thewhite.travel", "bb@office.eu"})
    public void shouldReturnTrueIfEmailValidate(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"@mail.net" , "harry-13@info", "gandalf.thewhite.travel", "b@b@.office.eu"})
    public void shouldReturnFalseIfEmailNotValidate(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsEmpty(String email) {
        assertFalse(validator.validateEmail(email));
    }

}

