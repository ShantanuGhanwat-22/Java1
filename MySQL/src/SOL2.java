import java.sql.*;

public class SOL2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/EmployeeRecord";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String updateQuery = "UPDATE DataOfEmployee SET age = 32 WHERE id = 12";
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println(rowsAffected + " rows updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
