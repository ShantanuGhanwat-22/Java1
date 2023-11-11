import java.sql.*;

public class SQL5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/EmployeeRecord";
        String username = "root";
        String password = "123456";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            String updateQuery1 = "UPDATE DataOfEmployee SET age = 35 WHERE id = 12";
            statement.executeUpdate(updateQuery1);

            String updateQuery2 = "UPDATE DataOfEmployee SET age = 27 WHERE id = 13";
            statement.executeUpdate(updateQuery2);

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
