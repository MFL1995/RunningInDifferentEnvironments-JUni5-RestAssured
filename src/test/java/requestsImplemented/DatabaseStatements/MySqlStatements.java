package requestsImplemented.DatabaseStatements;

import utils.MySqlDatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlStatements {
    public void performQuery() {
        // Create an instance of the MySqlDatabaseConnection class
        MySqlDatabaseConnection dbConnection = new MySqlDatabaseConnection();

        try {
            // Establish the database connection
            dbConnection.connect();

            // Execute the query
            String query = "SELECT * FROM your_table";
            ResultSet resultSet = dbConnection.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Access the data
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Process the data as needed
            }

            // Close the result set
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Disconnect from the database
            try {
                dbConnection.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public void performSecondQuery() throws CustomException {
        try {
            // Create an instance of the MySqlDatabaseConnection class
            MySqlDatabaseConnection dbConnection = new MySqlDatabaseConnection();

            // Establish the database connection
            dbConnection.connect();

            // Execute the query
            String query = "SELECT * FROM your_table";
            ResultSet resultSet = dbConnection.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Access the data
                int id = resultSet.getInt("id");
                System.out.println("id is: " + id);
                // Process the data as needed
            }

            // Close the result set
            resultSet.close();

            // Disconnect from the database
            dbConnection.disconnect();
        } catch (SQLException e) {
            // Handle the SQLException or rethrow it wrapped in a custom exception
            throw new CustomException("Failed to perform query", e);
        }
    }


}
