package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new BookManager().createBook("Solaris","Stanisław Lem");
        Book book2 = new BookManager().createBook("Ubik","Philip K. Dick");
        Book book3 = new BookManager().createBook("Valis","Philip K. Dick");

        System.out.println(book1 + "  TESTOWY TEKST BO NIE DZIAA-AA");
        System.out.println(book2);
        System.out.println(book3);

    }
}
