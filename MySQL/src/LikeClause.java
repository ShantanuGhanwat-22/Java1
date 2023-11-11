import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LikeClause {
   static final String DB_URL = "jdbc:mysql://localhost:3305/XYZ";
   static final String USER = "root";
   static final String PASS = "123456";
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records without condition...");
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }

         // Select all records having ID equal or greater than 101
         System.out.println("Fetching records with condition...");
         String sql = "SELECT id, first, last, age FROM Registration" +
            " WHERE first LIKE '%jo%'";
         rs = stmt.executeQuery(sql);

         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}