import java.sql.*;

public class SQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/XYZ";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String insertQuery = "INSERT INTO SchoolRecord (NameofStudent, AgeOfStudent) VALUES ('John Doe', 30)";
            int rowsAffected = statement.executeUpdate(insertQuery);
            System.out.println(rowsAffected + " rows inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
	