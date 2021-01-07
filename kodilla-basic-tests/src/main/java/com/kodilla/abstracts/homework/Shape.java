package com.kodilla.abstracts.homework;

public abstract class Shape {

    private final String type;

    public Shape(String type) {
        this.type = type;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    public String getType() {
        return type;
    }
}
