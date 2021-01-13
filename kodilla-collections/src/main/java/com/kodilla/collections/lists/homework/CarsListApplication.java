package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(90);
        cars.add(ford);
        cars.add(new Nissan(85));
        cars.add(new Opel(33));

        cars.remove(2);
        cars.remove(ford);


        for (Car car : cars ) {
            if (car.getSpeed() > 60)
                System.out.println(car);

        }

        System.out.println(cars.size());
    }

}
