package com.kodilla.inheritance.homework;

public class RemoteControl extends OperatingSystem {
    public RemoteControl(int releaseDate) {
        super(releaseDate);
    }

    public void turnOn() {
        System.out.println("Remotely turned on");
    }
}
