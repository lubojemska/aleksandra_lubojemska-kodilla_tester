package com.kodilla.exception.homework;

import com.kodilla.stream.exception.homework.OrderDoesntExistException;
import com.kodilla.stream.exception.homework.Warehouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WarehouseTestSuite {

    @Test
    public void testOrderDoesNotExist() throws OrderDoesntExistException {
        Assertions.assertThrows(OrderDoesntExistException.class , ()-> Warehouse.getOrder("1"));
    }

}
