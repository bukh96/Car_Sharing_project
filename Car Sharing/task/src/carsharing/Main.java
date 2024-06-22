package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:C://Users//alexu//IdeaProjects//Car Sharing1//Car Sharing//task//src//carsharing//db//carsharing";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL);
            connection.setAutoCommit(true);

            // Execute a query
            System.out.println("Creating table in given database...");
            statement = connection.createStatement();
            String sql = "CREATE TABLE   COMPANY " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR )";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // Clean-up environment
            statement.close();
            connection.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }


}
