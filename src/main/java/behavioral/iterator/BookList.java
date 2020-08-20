package behavioral.iterator;

import java.util.ArrayList;

public class BookList<Book> extends ArrayList {
    @Override
    public java.util.Iterator<Book> iterator() {
        throw new RuntimeException("У нас свои итераторы");
    }

    public Iterator getBookNameIterator() {
        return new BookIterator.NameIterator(this);
    }

    public Iterator getAuthorIterator() {
        return new BookIterator.AuthorIterator(this);
    }

    public Iterator getYearIterator() {
        return new BookIterator.YearIterator(this);
    }
}
