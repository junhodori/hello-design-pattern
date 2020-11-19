package pattern.behavioral.iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public void appendBook(Book book) {
        books[last++] = book;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int getLast() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
