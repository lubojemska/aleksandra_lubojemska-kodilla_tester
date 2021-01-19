package com.kodilla.inheritance.homework;

public class Button extends OperatingSystem {
    public Button(int releaseDate) {
        super(releaseDate);
    }

    public void turnOff() {
       System.out.println("Forced shutdown");
    }
}
