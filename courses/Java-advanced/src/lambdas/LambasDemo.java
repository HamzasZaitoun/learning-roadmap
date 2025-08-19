package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambasDemo {



    public static void print(String message)
    {
        System.out.println("hi");
    }




    public static void show()
    {

        List<String> list=List.of("a","b","c");
        Consumer<String> print =(System.out::println);
        Consumer<String> printUpperCase =(item-> System.out.println(item.toUpperCase()));

        list.forEach(print.andThen(printUpperCase).andThen(LambasDemo::print));

    }
//    public static void show()
//    {
//List<Integer> list = List.of(1,2,3);
//
//        for (var item:list)
//    {
//        System.out.println(item);
//    }
//        list.forEach(item-> System.out.println(item));
//        greet(LambasDemo::print);
//
//        greet((message)->{
//            System.out.println(message);
//        } );
//
//        greet(System.out::println);
//        Printer printer = message -> System.out.println("ja");
//    }
//
//    public static void greet(Printer printer)
//    {
//        printer.print("Hello world");
//    }
}
