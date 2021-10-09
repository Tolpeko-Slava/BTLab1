package com.company;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book firstBook = new Book("Книга1", "а", 100, 6,"94");
        Book secondBook= new Book("Книга2", "б", 23, 1,"105");
        Book thirdBook = new Book("Книга3", "в", 53, 2,"305");
        Book fourthBook = new Book("Книга4", "г", 230, 7,"1284");

        System.out.println("Default order");
        System.out.println(secondBook.toString());
        System.out.println(firstBook.toString());
        System.out.println(fourthBook.toString());
        System.out.println(thirdBook.toString());


        TreeSet<Book> books  = new TreeSet<Book>();

        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Default sort (isbn)");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookAuthorComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by author");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookPriceComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by price");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookNameComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by title");
        for (Book book: books) {
            System.out.println(book.toString());
        }



    }
}
