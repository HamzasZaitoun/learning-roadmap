import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        BookInventory bookInventory=new BookInventory();
//        Path data = Path.of("books.json");

        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));


//        try {
//            System.out.println( bookInventory.searchBook("title1"));
//        } catch (BookNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        bookInventory.listBooks();


        try {
            var inv = new BookInventory();
            var data = Path.of("books.json");

            inv.loadFromJson(data);
            inv.addBook(new Book("Clean Code", "Robert Martin", 464));
            inv.addBook(new Book("Clean Cewode", "Robert Martin", 464));
            inv.addBook(new Book("Clean Coewde", "Robert Martin", 464));
            inv.listBooks();
            inv.saveToJson(data);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}