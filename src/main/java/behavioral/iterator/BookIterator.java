package behavioral.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public abstract class BookIterator implements Iterator {
    ArrayList<Book> data;
    int cursor;
    int collectionSize;

    public BookIterator(Collection<Book> collection) {
        this.data = new ArrayList<>(collection);
        this.cursor = -1;
        collectionSize = collection.size();
    }

    @Override
    public boolean hasNext() {
        if(cursor >= collectionSize - 1)
            return false;
        return true;
    }

    @Override
    public Object getNext() {
        cursor++;
        return data.get(cursor);
    }

    public static class NameIterator extends BookIterator {
        public NameIterator(Collection<Book> collection) {
            super(collection);
            data.sort(Comparator.comparing(Book::getName));
        }
    }

    public static class AuthorIterator extends BookIterator {
        public AuthorIterator(Collection<Book> collection) {
            super(collection);
            data.sort(Comparator.comparing(Book::getAuthor));
        }
    }

    public static class YearIterator extends BookIterator {
        public YearIterator(Collection<Book> collection) {
            super(collection);
            data.sort(Comparator.comparing(Book::getYear));
        }
    }
}
