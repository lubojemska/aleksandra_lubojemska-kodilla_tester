package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Solaris","Stanisław Lem");
        Book book2 = BookManager.createBook("Ubik","Philip K. Dick");
        Book book3 = BookManager.createBook("Valis","Philip K. Dick");
        Book book4 = BookManager.createBook("Valis","Philip K. Dick");

        System.out.println(book1.getTitle() + ", " + book1.getAuthor());
        System.out.println(book2.getTitle() + ", " + book2.getAuthor());
        System.out.println(book3.getTitle() + ", " + book3.getAuthor());

        System.out.println("----------------------");

        book1.hashCode();
        book2.hashCode();
        book3.hashCode();
        book4.hashCode();
        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book3 == book1);
        System.out.println(book4 == book3);
    }
}
