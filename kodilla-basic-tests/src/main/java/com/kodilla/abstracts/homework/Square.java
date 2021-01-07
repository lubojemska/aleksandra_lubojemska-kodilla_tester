package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        super("square");
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getArea() {
        return a*a;

    }

    @Override
    public double getCircumference() {
        return a*4;

    }
}

