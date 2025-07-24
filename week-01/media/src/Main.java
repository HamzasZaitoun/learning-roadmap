<<<<<<< HEAD
=======
import java.util.LinkedList;
import java.util.List;
>>>>>>> f7db84de4bc7b8dd851e0694a6c985c9e69ac3c7
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
//        List<Media> library = List.of(new Book("wonderland","Hazem",234),new Ebook("Fantastic four","Marvel",3423));
=======
        List<Media> library = List.of(new Book("wonderland","Hazem",234),new Ebook("Fantastic four","Marvel",3423));
>>>>>>> f7db84de4bc7b8dd851e0694a6c985c9e69ac3c7
//        for (Media media : library)
//        {
//            if (media instanceof Printable printable) {
//                printable.print();
//            }
//            media.display();
//        }
<<<<<<< HEAD

        var recursion = new Recursion();

        System.out.println(recursion.fibonacci(4));

=======
        var finder = new BookService();
        try {
            finder.findBookByTitle("lalaland",library);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());;
        }

>>>>>>> f7db84de4bc7b8dd851e0694a6c985c9e69ac3c7
    }
}