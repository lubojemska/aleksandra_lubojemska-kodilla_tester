package com.kodilla.abstracts.homework;

public abstract class Job {
    public double salary;
    public String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}
