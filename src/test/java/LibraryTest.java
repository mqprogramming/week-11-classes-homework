import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private ArrayList<Book> newBooks;

    private ArrayList<Book> bookCollection;
    private Borrower borrower;

    @Before
    public void before() {
        book1 = new Book("Great Title", "Me", "Action/Adventure");
        book2 = new Book("Great Title", "Me", "Action/Adventure");
        book3 = new Book("Great Title", "Me", "Action/Adventure");
        book4 = new Book("Great Title", "Me", "Action/Adventure");
        newBooks = new ArrayList<Book>();
        library = new Library(newBooks, 3);

        bookCollection = new ArrayList<Book>();
        borrower = new Borrower(bookCollection);
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks() );
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks() );
    }

    @Test
    public void canCheckIfStockIsFull__false() {
        assertEquals(false, library.isStockFull() );
    }

    @Test
    public void canCheckIfStockIsFull__true() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(true, library.isStockFull() );
    }

    @Test
    public void cannotAddBookWhenFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void borrowerCanTakeBook() {
        library.addBook(book3);
        borrower.takeBook(library, book3);
        assertEquals(1, borrower.bookCollectionCount() );
        assertEquals(0, library.countBooks());
    }

}
