package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natasha on 24/10/2016.
 */
public class BookDBAO {

    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfer the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    //Add a getAllBooks() method in BookDBAO.java
    //that will return an array of BookDetails object
    public List<BookDetails> getAllBooks() {
        ArrayList<BookDetails> list = new ArrayList<BookDetails>();

        for (int i=0; i<5; i++){
            BookDetails b1 = new BookDetails();
            b1.setBookId("" + i);
            b1.setDescription("Book Description " + i);
            b1.setFirstName("First Name " + i);
            b1.setSurname("Expert");
            b1.setInventory(i);
            b1.setOnSale(true);
            b1.setPrice(5.9f);
            b1.setTitle("Book Title " + i);
            b1.setYear(2015 + i);
            list.add(b1);
        }

        return list;
    }
}
