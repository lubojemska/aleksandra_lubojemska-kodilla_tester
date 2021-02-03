package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Design", LocalDate.of(2020,02,5), LocalDate.of(2020,12,10)));
        tasks.add(new Task("Print", LocalDate.of(2020,11,6), LocalDate.of(2020,12,20)));
        tasks.add(new Task("Mail", LocalDate.of(2020,12,7), LocalDate.of(2022,01,28)));
        return tasks;
    }
}
