package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Nissan{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nissan nissan = (Nissan) o;
        return speed == nissan.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
