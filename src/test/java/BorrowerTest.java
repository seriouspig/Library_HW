import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Borrower borrower;

    @Before
    public void before() {
        book1 = new Book ("Harry Potter", "J.K.Rowling", "Fantasy");
        book2 = new Book ("Java for Dummies", "Malcolm M", "Education");
        book3 = new Book ("The Anatomy Coloring Book", "Wynn Kapit", "Education");
        book4 = new Book ("The Passenger", "Ulrich Alexander Boschwitz", "Thriller");
        book5 = new Book ("The Secret", "Rhonda Byrne", "Self help");
        library = new Library(4);
        borrower = new Borrower("Paul");
    }

    @Test
    public void hasBooks() {
        assertEquals(0, borrower.collectionSize());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBook(library);
        assertEquals(1, borrower.collectionSize());
        assertEquals(2, library.getBookCount());
    }

}
