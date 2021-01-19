package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
        public void findDeparture() {
            Flight flight = new Flight("Cracow", "Moscow");

            List<Flight> result = flightFinder.findFlightsFrom("Cracow");

            List<Flight> expectedList = new ArrayList<>();
            expectedList.contains(flight);
            assertEquals(expectedList, result);
        }

    @Test
    public void findArrival() {
        Flight flight = new Flight("Frankfurt", "Amsterdam");

        List<Flight> result = flightFinder.findFlightsTo("Amsterdam");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.contains(flight);
        assertEquals(expectedList, result);
    }



}