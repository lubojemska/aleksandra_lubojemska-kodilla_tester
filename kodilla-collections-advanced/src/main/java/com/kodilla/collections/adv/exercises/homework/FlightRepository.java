package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> fligths = new ArrayList<>();
        fligths.add(new Flight("Cracow", "Moscow"));
        fligths.add(new Flight("Frankfurt", "Amsterdam"));
        fligths.add(new Flight("Warsaw", "Radom"));
        return fligths;
    }



}
