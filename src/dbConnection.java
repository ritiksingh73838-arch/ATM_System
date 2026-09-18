import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public static void main (String...args){
        String url="jdbc:mysql://localhost:3306/ATM_db";
        String username = "root";
        String password = "ritik9934";
        try{
            Connection connection =
                    DriverManager.getConnection
                            (url,username,password);
         System.out.println("mysql Connected Successfully");
         java.sql.Statement stmt =
                 connection.createStatement();
         java.sql.ResultSet rs =
                 stmt.executeQuery("SELECT * from accounts");
         while (rs.next()){
             System.out.println("Data found:" +
                     ""+rs.getString("account_number"));
         }


         connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
