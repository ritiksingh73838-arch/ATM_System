import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class dbConnection {

    public static void main(String[] args) {
        Properties props = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            props.load(in);
        } catch (IOException e) {
            System.out.println("config.properties nahi mili: " + e.getMessage());
            return;
        }

        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM accounts")) {
            System.out.println("mysql Connected Successfully");
            while (rs.next()) {
                System.out.println("Data found: " + rs.getString("account_number"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}