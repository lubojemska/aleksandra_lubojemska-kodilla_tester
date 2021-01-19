package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    final String title;
    final String intDuration;

    public Task(String title, String intDuration) {
        this.title = title;
        this.intDuration = intDuration;
    }

    public String getTitle() {
        return title;
    }

    public String getIntDuration() {
        return intDuration;
    }
}
