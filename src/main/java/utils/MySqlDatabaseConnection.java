package utils;

import java.sql.*;

public class MySqlDatabaseConnection {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public MySqlDatabaseConnection() {
        this.url = "jdbc:mysql://database";
        this.username = "novitas";
        this.password = "novitas";
    }

    public synchronized void connect() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        /*
            Establish the database connection.
            Adding synchronization to the methods in the MySqlDatabaseConnection class
            is necessary to make them thread-safe, which enables parallel execution.
        */
    }

    public synchronized void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        /*
            Disconnect from the database.
            Adding synchronization to the methods in the MySqlDatabaseConnection class
            is necessary to make them thread-safe, which enables parallel execution.
        */
    }

    public synchronized ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);

        /*
        Adding synchronization to the methods in the MySqlDatabaseConnection class
        is necessary to make them thread-safe, which enables parallel execution.
        */

        /*
            Example usage of executeQuery:
            String query = "SELECT * FROM users";
            ResultSet resultSet = connection.executeQuery(query);

            Process the result set
            while (resultSet.next()) {
                // Access the data
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
            }
            // Close the result set
            resultSet.close();
        */
    }

    public synchronized int executeUpdate(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(query);
        /*
        Adding synchronization to the methods in the MySqlDatabaseConnection class
        is necessary to make them thread-safe, which enables parallel execution.
        */

        /*
            Example usage of executeUpdate:
            String insertQuery = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
            int rowsAffected = connection.executeUpdate(insertQuery);
        */
    }
}

/*
        More info about Synchronization
        When multiple threads try to access shared resources (such as the database connection) simultaneously,
        synchronization ensures that only one thread can access the shared resource at a time.
        This prevents concurrent access issues, such as data corruption or inconsistent state.
*/