package four.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlStoreConnectionPool implements ConnectionPool {

    private static SqlStoreConnectionPool POOL_INSTANCE = null;

    private static int INITIAL_POOL_SIZE = 10;
    private List<Connection> connectionPool = new ArrayList<>(INITIAL_POOL_SIZE);
    private List<Connection> usedConnections = new ArrayList<>();

    private SqlStoreConnectionPool() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            Connection connection = createConnection();
            connectionPool.add(connection);
        }
    }

    public static ConnectionPool createConnectionPool() {
        if (POOL_INSTANCE == null) {
            POOL_INSTANCE = new SqlStoreConnectionPool();
        }
        return POOL_INSTANCE;
    }

    private Connection createConnection() {
        try {
            Connection connection = DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            return connection;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }


    @Override
    public Connection getConnection() {
        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }

    @Override
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/sql_store";
    }

    @Override
    public String getUsername() {
        return "root";
    }

    @Override
    public String getPassword() {
        return "root";
    }
}
