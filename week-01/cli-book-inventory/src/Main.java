
public class Main {
    public static void main(String[] args) {

        BookInventory bookInventory=new BookInventory();

        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));
        bookInventory.addBook(new Book("title1","author1",431));

//        try {
//            System.out.println( bookInventory.searchBook("title1"));
//        } catch (BookNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        bookInventory.listBooks();

    }
}