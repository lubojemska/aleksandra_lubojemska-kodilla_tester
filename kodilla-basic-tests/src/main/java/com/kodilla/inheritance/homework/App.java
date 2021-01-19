package com.kodilla.inheritance.homework;

public class App {

    public static void main(String[] args) {
    OperatingSystem operatingSystem = new OperatingSystem(2011);
    RemoteControl remoteControl = new RemoteControl(2020);
    Button button = new Button(2010);
    operatingSystem.setReleaseDate(2020);
            System.out.println("System was released in: "+" "+ operatingSystem.getReleaseDate());
            remoteControl.turnOn();
            button.turnOff();


    }
}


