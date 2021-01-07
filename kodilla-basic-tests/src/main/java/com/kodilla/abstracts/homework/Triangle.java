package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


    public Triangle(double a, double b, double c, double h) {
        super("triangle");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*a*h;
    }

    @Override
    public double getCircumference() {
        return a+b+c;

    }
}
