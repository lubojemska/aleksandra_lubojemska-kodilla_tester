package com.kodilla.inheritance.homework;

public class App {

    public static void main(String[] args) {
    OperatingSystem operatingSystem = new OperatingSystem();
    RemoteControl remoteControl = new RemoteControl();
    Button button = new Button();
    operatingSystem.setReleaseDate(2020);
            System.out.println("System was released in: "+" "+ operatingSystem.getReleaseDate());
            remoteControl.turnOn();
            button.turnOff();


    }
}


