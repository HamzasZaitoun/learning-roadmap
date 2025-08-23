package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class  StreamsDemo {

    public static void show()
    {
        List<Movie>movies = List.of
                (new Movie("b",10,Genre.ACTION),
                new Movie("c",15,Genre.COMEDY),
                new Movie("a",220,Genre.ACTION));

        /// [10.20.30]
        /// [30,30]
        /// [60]
        IntStream.rangeClosed(1,5)
                        .forEach(System.out::println);

    }
}








































//List<Movie>movies = List.of(new Movie("a",10),new Movie("b",15),new Movie("c",20));
//
//        movies.stream()
//                .map(movie -> movie.getTitle())
//        .forEach(name-> System.out.println(name));
//
//
//var stream = Stream.of(List.of(1,2,3),List.of(4,5,6));
//        stream
//                .flatMap(list->list.stream())
//        .forEach(list-> System.out.println(list));




////imperitive: how it should be done.
//// declarative: what should be done! (ex. SQL)
////  Streams: to process a collection of data in a declarative way
//List<Movie>movies = List.of(new Movie("a",10),new Movie("b",15),new Movie("c",20));
//
//// Imperative programming
//int count= 0;
//        for (var movie:movies)
//        {
//        if (movie.getLikes()>10)
//count++;
//        }
//
//// declarative (functional) programming:
//// stream: a sequence of objects, a way to get data out of a collection, does not store data!
//var count2 = movies.stream()
//        .filter(movie -> movie.getLikes()>10)
//        .count();

