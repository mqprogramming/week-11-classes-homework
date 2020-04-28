import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(ArrayList<Book> someBooks, int someCapacity) {
        this.books = someBooks;
        this.capacity = someCapacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public boolean isStockFull() {
        if (countBooks() < capacity) {
            return false;
        } else {
            return true;
        }
    }

    public void addBook(Book book) {
        if (isStockFull() == false) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

}
