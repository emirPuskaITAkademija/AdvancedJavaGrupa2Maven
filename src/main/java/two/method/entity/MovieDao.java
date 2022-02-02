package two.method.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * <li>
 *     1. Connection connection = DriverManager.
 *     Povezati na izvor podataka.
 *        1.1 Driver dodati ili lib mysql
 *        1.2 imati prava pristupa bazi
 * </li>
 * <li>
 *     2. Statement stamenet = connection.creat...
 *     SLati upite i tražiti podatke
 * </li>
 *
 * <li>
 *     3. ResultSet resultSet = statement.executeQuery();
 *     Procesirati i obraditi rezultat upita ili dobijene podatke obraditi
 * </li>
 */
public class MovieDao {

    static final String URL = "jdbc:mysql://localhost:3306/movies";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    public List<Movie> loadMovies(){
        List<Movie> movies = new ArrayList<>();
        //1. Connection
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
            //2.Statement
            Statement statement = connection.createStatement();
            //3. ResultSet
            ResultSet resultSet = statement.executeQuery("SELECT * FROM movies");
            while (resultSet.next()){
                int movieId = resultSet.getInt("movie_id");
                String movieTitle = resultSet.getString(2);
                String director = resultSet.getString(3);
                int year = resultSet.getInt("year");
                int genreId = resultSet.getInt(5);
                Movie movie = new Movie(movieId, movieTitle, director, year, genreId);
                movies.add(movie);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }

        return movies;
    }
}
