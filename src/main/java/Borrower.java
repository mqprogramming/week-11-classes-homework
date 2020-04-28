import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower(ArrayList<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int bookCollectionCount() {
        return this.bookCollection.size();
    }

    public void takeBook(Library library, Book book) {
        library.removeBook(book);
        this.bookCollection.add(book);
    }

}
