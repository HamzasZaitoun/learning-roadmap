import java.util.List;

public class BookService {

    public Media findBookByTitle(String title, List<Media> books) throws BookNotFoundException {
        for (Media book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                return book;

            }
        }
        throw new BookNotFoundException("the book with title: " + title + "does not exist!");
    }
}
