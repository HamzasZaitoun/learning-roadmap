package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambasDemo {



    public static void print(String message)
    {
        System.out.println("hi");
    }




    public static void show()
    {




    }
//    public static void show()
//    {


//
//    UnaryOperator<Integer> square = n->n*n;
//    UnaryOperator<Integer> increment= n->n+ 1;
//    var result = increment.andThen(square).apply(1);
//        System.out.println(result);
//BinaryOperator<Integer> add = (a,b)->a+b;
//    Function<Integer,Integer> square = a->a*a;
//    var result = add.andThen(square).apply(1,2);
//        System.out.println(result);
//Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//    Predicate<String> hasrightBrace = str -> str.endsWith("}");
//
//    Predicate<String>hasLeftAndRightBrace= hasLeftBrace.and(hasrightBrace);
//
//          hasLeftBrace.negate();
//    var result = hasLeftAndRightBrace.test("yes!!{}");
//        System.out.println(result);
//Predicate<String> isLongerThan5 = str->str.length()>5;
//    var testd= isLongerThan5.test("erterthieo");
//        System.out.println(testd);

//    Function<String,String> replaceColon = str->str.replace(":","=");
//    Function<String,String> addBraces = str->"{" + str +"}";
//    var result = replaceColon
//            .andThen(addBraces)
//            .apply("key:value");
//        System.out.println(result);
//        addBraces.compose(replaceColon)
//            .apply("key:value");
//
//Function<String,Integer> map = str ->str.length();
//    var length = map.apply("SKY");
//        System.out.println(length);

//Supplier<Double> getRandom = () -> Math.random();
//
//    var random = getRandom.get();
//        System.out.println(random);


//    List<String> list=List.of("a","b","c");
//    Consumer<String  > print =(System.out::println);
//    Consumer<String> printUpperCase =(item-> System.out.println(item.toUpperCase()));
//
//        list.forEach(print.andThen(printUpperCase).andThen(LambasDemo::print));

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
