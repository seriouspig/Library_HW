import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;

    public Library (int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<String, Integer>();


    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        Book bookRemoved = null;
        if (this.getBookCount() > 0) {
            bookRemoved = this.books.remove(0);
        }
        return bookRemoved;
    }

    public HashMap bookGenres() {
        HashMap genres = null;
        for (Book book : this.books) {
            int numOfBooks = Collections.frequency(this.books, book.getGenre());
            genres.put(book.getGenre(), numOfBooks);
        }
        return genres;

    }



}
