package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        super("circle");
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*r;

    }
}
