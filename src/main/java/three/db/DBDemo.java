package three.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//jdbc:mysql://localhost:3306/movies
public class DBDemo {
    public static void main(String[] args) throws Exception {
        //1. Connection -> username, password, URL
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/movies",
                "root",
                "root");
        //2. SQL statement
        Statement statement = connection.createStatement();
        //3. Dobili podatke
        ResultSet resultSet = statement.executeQuery("SELECT *FROM movies");
        while (resultSet.next()){
            Integer movieId = resultSet.getInt("movie_id");
            String movieTitle = resultSet.getString(2);
            System.out.println(movieId+"  " + movieTitle);
        }

    }
}
