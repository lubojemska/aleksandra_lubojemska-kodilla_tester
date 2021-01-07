package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 3;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 7;
    }
}
