package com.kodilla.collections.interfaces.homework;

public class Nissan implements Car {
    int speed;

    public Nissan(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 8;

    }

    @Override
    public void decreaseSpeed() {
    speed -= 9;
    }
}
