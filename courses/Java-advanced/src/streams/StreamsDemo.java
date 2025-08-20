package streams;

import java.util.List;
import java.util.stream.Stream;

public class  StreamsDemo {

    public static void show()
    {
        List<Movie>movies = List.of(new Movie("a",10),new Movie("b",15),new Movie("c",20));

        movies.stream()
                .limit(2)
                .skip(1)
                .limit(0)
                .takeWhile(m->m.getLikes()>15) // the moment condition becomes false, it stops!
                .dropWhile(m->m.getLikes()<15)
                .forEach(m-> System.out.println(m.getTitle()));
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

