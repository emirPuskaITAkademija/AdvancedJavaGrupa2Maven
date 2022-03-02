package four;

import four.jdbc.ConnectionPool;
import four.jdbc.Customer;
import four.jdbc.SqlStoreConnectionPool;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * FORMAT URL : jdbc:kojiDriver:imeBaze
 * jdbc:mysql://localhost:3306/sql_store
 * <li>1. Connection connection = DriverManager.getConnection(url, username, password)</li>
 * <li>2. Statement statement = connection.createStatement()
 *          PreparedStatement ps =
 *          CallableStatement cs =
 *
 * </li>
 * <li>3. ResultSet resultSet = statement.executeQuery("SELECT * FROM customers")</li>
 * <p>
 * <p>
 * ConnectionPool---container Connection c1, c2, c3, c4, c5, c6..c20
 */
public class Demo {
    public static void main(String[] args) {
        ConnectionPool sqlStoreConnectionPool = SqlStoreConnectionPool.createConnectionPool();

        Connection connection = sqlStoreConnectionPool.getConnection();


        try (Statement statement = connection.createStatement();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("UPDATE customers SET points=? WHERE customer_id=?")
        ) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            //UPDATE customers SET points=10000 WHERE customer_id=1;
            while (resultSet.next()) {

                Customer customer = new Customer();
                Integer points = resultSet.getInt("points");
                customer.setPoints(points);
                Integer customerId = resultSet.getInt(1);
                if(customerId == 1){
                    preparedStatement.setInt(1, points+1500);
                    preparedStatement.setInt(2, customerId);
                    preparedStatement.executeUpdate();
                }
                customer.setCustomerId(customerId);
                String firstName = resultSet.getString("first_name");
                customer.setFirstName(firstName);
                String lastName = resultSet.getString(3);
                customer.setLastName(lastName);
                Date birthday = resultSet.getDate("birth_date");
                LocalDate birthDate = birthday.toLocalDate();
                customer.setBirthday(birthDate);
                String phone = resultSet.getString("phone");
                customer.setPhone(phone);
                String address = resultSet.getString("address");
                customer.setAddress(address);
                String city = resultSet.getString("city");
                customer.setCity(city);
                String state = resultSet.getString("state");
                customer.setState(state);

                System.out.println(customer);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        sqlStoreConnectionPool.releaseConnection(connection);
    }
}
