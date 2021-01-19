package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal richard = new Principal("Richard", "Black");
        Principal martha = new Principal("Martha", "Stewart");


        School primarySchool = new School("Primary school", 84, 30, 21, 18, 13);
        School secondarySchool = new School("Secondary school", 20, 26, 42);


        schools.put(richard, primarySchool);
        schools.put(martha, secondarySchool);

        System.out.println(schools.get(martha));


        for (Map.Entry<Principal, School> principalEntry : schools.entrySet()) {
            System.out.println("Principal: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + ", school: " + principalEntry.getValue().getName() + ", number of students: " +
                    principalEntry.getValue().getSum());
        }
    }

    }

