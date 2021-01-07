package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(14.0);
        System.out.println("Type: " + square.getType() + ", area: " + square.getArea() + ", circumference: " + square.getCircumference());

        Circle circle = new Circle(13.0);
        System.out.println("Type: " + circle.getType() + ", area: " + circle.getArea() + "circumference: " + circle.getCircumference());

        Triangle triangle = new Triangle(4.5, 6.0, 7.0, 5.0);
        System.out.println("Type: " + triangle.getType() + ", area: " + triangle.getArea() + ", circumference: " + triangle.getCircumference());


        //--------------------------------------- JOB ------------------------------------------------------------
        Person person1 = new Person("Ania", 25, new Engineer());
        Person person2 = new Person("Marek", 48, new Nurse());
        Person person3 = new Person("Patryk",34, new Teacher());

        System.out.println(person1.getFirstName()+ "'s responsibility is "+ person1.getJob().getResponsibilities());
        System.out.println(person2.getFirstName()+ "'s responsibility is " + person2.getJob().getResponsibilities());
        System.out.println(person3.getFirstName()+ "'s responsibility is " +person3.getJob().getResponsibilities());
    }
}