package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public boolean isBookAvailable(String isbn) {
        return books.containsKey(isbn);
    }

    public boolean borrowBook(String isbn) {
        if (isBookAvailable(isbn)) {
            books.remove(isbn);
            return true;
        } else {
            return false;
        }
    }

    public void returnBook(Book book) {
        books.put(book.getIsbn(), book);
    }

}
