package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamps = new HashSet<>();
        stamps.add(new Stamps("Poland", 10.0, 20.0, true ));
        stamps.add(new Stamps("Italy", 20.0, 20.0, false ));
        stamps.add(new Stamps("Ireland", 5.0, 20.0, true ));
        stamps.add(new Stamps("Poland", 10.0, 20.0, true ));

        System.out.println(stamps.size());
        for (Stamps stamp : stamps)
            System.out.println(stamp);


    }
}
