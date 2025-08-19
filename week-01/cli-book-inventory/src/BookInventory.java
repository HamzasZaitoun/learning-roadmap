import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookInventory {

    private Set<Book> books = new HashSet<>();
    private static final Gson GSON = new Gson();
    private static final Type LIST_OF_BOOK = new TypeToken<List<Book>>() {}.getType();

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

    public void saveToJson(Path path) throws IOException {
        if (path.getParent()!=null)
            Files.createDirectories(path.getParent());

        try (Writer writer = Files.newBufferedWriter(path)){

            GSON.toJson(new ArrayList<>(books),writer);

        }
    }

    public void loadFromJson(Path path) throws IOException
    {
        books.clear();
        if(!Files.exists(path)) return;

        // here using try-with-resource, to automatically close the reader when finish
        try (Reader reader = Files.newBufferedReader(path)) {
            List<Book> loaded = GSON.fromJson(reader,LIST_OF_BOOK);

            if(loaded!=null)
                books.addAll(loaded);

        }
    }

}