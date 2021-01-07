package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(70);
        doRace(ford);

        Opel opel = new Opel(50);
        doRace(opel);

        Nissan nissan = new Nissan(90);
        doRace(nissan);

    }
    private static void doRace(Car car) {

        car.increaseSpeed();

        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
