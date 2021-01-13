package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[new Random().nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++ ) {
            cars[i] = CarsApplication.drawCar();
            CarUtils.describeCar(cars[i]);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        switch (drawnCar) {
            case 0:
                return new Opel(random.nextInt(300));
            case 1:
                return new Nissan(random.nextInt(300));
            default:
                return new Ford(random.nextInt(300));
        }
    }
}
