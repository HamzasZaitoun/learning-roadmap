import java.util.HashSet;
import java.util.Set;

public class BookInventory {

    private Set<Book> books = new HashSet<>();

    public BookInventory() {
    }

    public BookInventory(Book book) {
        books.add(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBook(String keyWord) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyWord.toLowerCase()) || book.getAuthor().toLowerCase().contains(keyWord.toLowerCase()))
                return book;
        }
        throw new BookNotFoundException("could not find the book: " + keyWord);
    }

}
