import java.sql.*;

public class SQL3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/EmployeeRecord";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String deleteQuery = "DELETE FROM DataOfEmployee WHERE id = 12";
            int rowsAffected = statement.executeUpdate(deleteQuery);
            System.out.println(rowsAffected + " rows deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
