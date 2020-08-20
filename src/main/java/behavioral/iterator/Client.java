package behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        BookList<Book> books = new BookList();
        books.add(new Book("dBook", "aAuthor", 102));
        books.add(new Book("sBook", "eAuthor", 100));
        books.add(new Book("aBook", "bAuthor", 103));
        books.add(new Book("cBook", "dAuthor", 105));
        books.add(new Book("bBook", "cAuthor", 104));

        System.out.println("year sorted");
        Iterator<Book> iter = books.getYearIterator();
        while (iter.hasNext()){
            Book book = iter.getNext();
            System.out.println("name: " + book.getName() + " author: " + book.getAuthor() + " year: " + book.getYear());
        }

        System.out.println("author sorted");
        iter = books.getAuthorIterator();
        while (iter.hasNext()){
            Book book = iter.getNext();
            System.out.println("name: " + book.getName() + " author: " + book.getAuthor() + " year: " + book.getYear());
        }

        System.out.println("name sorted");
        iter = books.getBookNameIterator();
        while (iter.hasNext()){
            Book book = iter.getNext();
            System.out.println("name: " + book.getName() + " author: " + book.getAuthor() + " year: " + book.getYear());
        }
    }
}
