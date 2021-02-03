package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("order1"));
        warehouse.addOrder(new Order("order2"));
        warehouse.addOrder(new Order("order7"));

        try {
            Order order = warehouse.getOrder("order1");
            System.out.println("Order number: " + order.getNumber() +  " exists.");
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist");
        }

    }
}
