import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {

//        Printer printer = new Printer() {
//            @Override
//            public void print() {
//                System.out.println("printer");
//            }
//
//            @Override
//            public String callMe() {
//                return "";
//            }
//        };
//        printer.print();

        Printer printer=(String p)-> System.out.println(p);
        printer.print("hello");

        Printer2<String> printer2 = (String msg) ->msg.toUpperCase();

        System.out.println( printer2.print("Java mastery") );
    }
}
