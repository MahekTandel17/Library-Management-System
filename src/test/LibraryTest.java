package test;

import library.Book;
import library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Java Programming", "John Doe", 2023);
        library.addBook(book);
        assertTrue(library.isBookAvailable("123456789"));
    }

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Java Programming", "John Doe", 2023);
        library.addBook(book);
        assertTrue(library.borrowBook("123456789"));
        assertFalse(library.isBookAvailable("123456789"));
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("123456789", "Java Programming", "John Doe", 2023);
        library.addBook(book);
        library.borrowBook("123456789");
        library.returnBook(book);
        assertTrue(library.isBookAvailable("123456789"));
    }

}
