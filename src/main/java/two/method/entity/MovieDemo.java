package two.method.entity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * <p>
 *     Lambda može kreirati umjesto operatora new objekat tipa
 *     funkcionalnog interfejsa.
 *     Lambda definira blok koda apstraktne metode.
 *     Ja to mogu jer funkcionalni interfejs ima samo jednu takvu metodu.
 * </p>
 * <p>
 *     Kada lambda tom prilikom ne radi ništa drugo nego samo poziva
 *     neku metodu.   ->  ::
 * </p>
 * <p>
 *     Tipovi metod referenciranja
 *     <li>1. REFERENCIRANJE NA STATIC METHOD</li>
 *     <li>2. REFERENCIRANJE MA METODU OBJEKTA</li>
 * </p>
 */
public class MovieDemo {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();
        List<Movie> movies = movieDao.loadMovies();
        //Java8 forEach  ... 1. izvor stream 2. međuoperacije 3. terminirajuću operaciju
        MovieComparator movieComparator = new MovieComparator();
        Comparator<Movie> movieYearComparator = movieComparator::compareByYear;
        Collections.sort(movies, movieComparator::compareByYear);
        movies.stream().forEach(MovieDemo::printMovie);
    }

    private static void printMovie(Movie movie){
        System.out.println(movie);
    }
}
