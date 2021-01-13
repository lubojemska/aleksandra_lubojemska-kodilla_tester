package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String stampName;
    private double height;
    private double width;
    private boolean stampled;

    public Stamps(String stampName, double height, double width, boolean stampled) {
        this.stampName = stampName;
        this.height = height;
        this.width = width;
        this.stampled = stampled;
    }

    public String getStampName() {
        return stampName;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStampled() {
        return stampled;
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampName='" + stampName + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", stampled=" + stampled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Double.compare(stamps.height, height) == 0 && Double.compare(stamps.width, width) == 0 && stampled == stamps.stampled && Objects.equals(stampName, stamps.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, height, width, stampled);
    }
}

