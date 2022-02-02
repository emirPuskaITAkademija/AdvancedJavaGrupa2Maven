package two.method.entity;

public class Movie {
    private Integer movieId;
    private String movieTitle;
    private String director;
    private Integer year;
    private int genreId;

    public Movie() {
    }

    public Movie(int movieId, String movieTitle, String director, int year, int genreId) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.director = director;
        this.year = year;
        this.genreId = genreId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieTitle='" + movieTitle + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genreId=" + genreId +
                '}';
    }
}
