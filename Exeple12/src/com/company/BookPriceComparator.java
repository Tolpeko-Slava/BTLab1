package com.company;
import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    public  int compare(Book a, Book b){
        return  a.getPrice()-b.getPrice();
    }

}
