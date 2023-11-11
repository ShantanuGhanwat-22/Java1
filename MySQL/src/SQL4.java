import java.sql.*;

public class SQL4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/EmployeeRecord";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String insertQuery = "INSERT INTO DataOfEmployee (name, age) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setInt(2, 30);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

