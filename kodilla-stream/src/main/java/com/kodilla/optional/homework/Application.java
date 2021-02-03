package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John Doe", new Teacher("Peter Jackson")));
        studentList.add(new Student("Jane Smith", null));
        studentList.add(new Student("Mark Twain", new Teacher("Edward Norton")));
        studentList.add(new Student("Mary Poppins", null));

        for (int s = 0; s< studentList.size(); s++){
            Student student = studentList.get(s);
            if (student.getTeacher() == null)
                System.out.println("Student: " + student.getName()+ "; Teacher: undefined");
            else
                System.out.println("Student: " + student.getName()+ "; Teacher: " + student.getTeacher());
        }
    }
}
