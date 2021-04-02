package com.kodilla.stream.homework;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTask()
                .stream()
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .forEach(tn -> System.out.println(tn));

    }

    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }
}
