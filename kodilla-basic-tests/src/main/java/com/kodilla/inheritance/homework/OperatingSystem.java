package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseDate;

    public OperatingSystem(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void turnOn() {
        System.out.println("Turned on");
    }
    public void turnOff() {
        System.out.println("Turned off");
    }
}
