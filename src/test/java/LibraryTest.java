import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before() {
        book1 = new Book ("Harry Potter", "J.K.Rowling", "Fantasy");
        book2 = new Book ("Java for Dummies", "Malcolm M", "Education");
        book3 = new Book ("The Anatomy Coloring Book", "Wynn Kapit", "Education");
        book4 = new Book ("The Passenger", "Ulrich Alexander Boschwitz", "Thriller");
        book5 = new Book ("The Secret", "Rhonda Byrne", "Self help");
        library = new Library(2);

    }

    @Test
    public void hasBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBooks() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cannotAddBooks() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canCheckGenres() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library.bookGenres());
        assertEquals(2, library.bookGenres().get("Education"));


    }


}
