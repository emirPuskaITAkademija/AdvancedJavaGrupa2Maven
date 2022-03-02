package five.dao;

import five.connection.SqlStoreConnectionPool;
import five.entity.Customer;
import four.jdbc.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements Dao<Customer> {
    @Override
    public void save(Customer entity) {

    }

    @Override
    public Customer get(Integer id) {
        Connection connection = SqlStoreConnectionPool.instance().getConnection();
        try(PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM customers WHERE customer_id=?")){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Customer customer = new Customer()
                        .setCustomerId(resultSet.getInt(1))
                        .setFirstName(resultSet.getString("first_name"))
                        .setLastName(resultSet.getString(3))
                        .setBirthday(resultSet.getDate("birth_date"))
                        .setPhone(resultSet.getString("phone"))
                        .setAddress(resultSet.getString("address"))
                        .setCity(resultSet.getString("city"))
                        .setState(resultSet.getString("state"))
                        .setPoints(resultSet.getInt("points"));
                return customer;
            }

        }catch (SQLException exception){
            System.err.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        Connection connection = SqlStoreConnectionPool.instance().getConnection();
        String sqlQuery = "SELECT * FROM customers";
        List<Customer> customers = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Customer customer = new Customer()
                        .setCustomerId(resultSet.getInt(1))
                        .setFirstName(resultSet.getString("first_name"))
                        .setLastName(resultSet.getString(3))
                        .setBirthday(resultSet.getDate("birth_date"))
                        .setPhone(resultSet.getString("phone"))
                        .setAddress(resultSet.getString("address"))
                        .setCity(resultSet.getString("city"))
                        .setState(resultSet.getString("state"))
                        .setPoints(resultSet.getInt("points"));
                customers.add(customer);
            }
            SqlStoreConnectionPool.instance().releaseConnection(connection);
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
        return customers;
    }

    @Override
    public void update(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }
}
