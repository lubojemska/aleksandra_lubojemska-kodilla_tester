package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Website", LocalDate.of(2019, 11, 20), LocalDate.of(2020, 01, 15)));
        tasks.add(new Task("Application", LocalDate.of(2020, 02, 13), LocalDate.of(2020, 01, 15)));
        tasks.add(new Task("Promotion", LocalDate.of(2021, 06, 26), LocalDate.of(2020, 01, 15)));
        return tasks;
    }
}
