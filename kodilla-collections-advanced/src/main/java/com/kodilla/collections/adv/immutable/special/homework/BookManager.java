package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public Book createBook(String title, String author) {
        for (Book book : books) {
            if(book.getAuthor().equals(author) && book.getTitle().equals(title))
                return book;
        }


        Book outcome = new Book(title, author);
        books.add(outcome);
        return outcome;
    }

    static List<Book> books = new ArrayList<>();

}

