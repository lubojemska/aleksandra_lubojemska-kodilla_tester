package com.kodilla.stream.exception.homework;

import java.util.*;

public class Warehouse {

    private static Set<Order> orderList = new HashSet<>();

    public static void addOrder(Order order) {
        orderList.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        return orderList.stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
