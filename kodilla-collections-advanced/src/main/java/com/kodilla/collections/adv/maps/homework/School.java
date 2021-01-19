package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classVolume = new ArrayList<>();

    public School(String name) {
        this.name = name;
        for (int school : classVolume)
            this.classVolume.add(school);
    }

    public String getName() {
        return name;
    }

    public School(String name, int... classVolume) {
        for (int school : classVolume)
            this.classVolume.add(school);
    }

    public int getSum() {
        int sum = 0;
        for (int school : classVolume)
            sum += school;
        return sum;
    }

    @Override
    public String toString() {
        return " ,number of students: " + classVolume.toString();
    }
}
