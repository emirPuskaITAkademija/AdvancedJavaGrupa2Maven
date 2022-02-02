package two.method.entity;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {
    //0 jednaki
    // 1
    //-1
    @Override
    public int compare(Movie m1, Movie m2) {
        //movieId, director, year
        if (m1.getMovieId() == m2.getMovieId()) {
            return 0;
        }
        int result = m1.getDirector().compareTo(m2.getDirector());
        if (result == 0) {
            result = m1.getYear().compareTo(m2.getYear());
        }
        return result;
    }

    public int compareByYear(Movie m1, Movie m2){
        return m1.getYear().compareTo(m2.getYear());
    }
}
