import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Media> library = List.of(new Book("wonderland","Hazem",234),new Ebook("Fantastic four","Marvel",3423));
        for (Media media : library)
        {
            if (media instanceof Printable printable) {
                printable.print();
            }
            media.display();
        }



    }
}