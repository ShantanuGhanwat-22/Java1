import java.sql.*;

public class SQL6 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/EmployeeRecord";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO DataOfEmployee (id,name, age) VALUES (1,'Alice', 25)");
            statement.addBatch("INSERT INTO DataOfEmployee (id,name, age) VALUES (2,'Bob', 28)");
            statement.addBatch("INSERT INTO DataOfEmployee (id,name, age) VALUES (3,'Carol', 23)");

            int[] batchResults = statement.executeBatch();
            for (int result : batchResults) {
                System.out.println("Rows affected: " + result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

