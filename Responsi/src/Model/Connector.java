package Model;
import java.sql.*;
public class Connector {
    private static String jdbc_driver = "com.mysql.cj.jdbc.driver";
    private static String url = "jdbc:mysql://localhost:3306/pabrik_db";
    private static String username = "root";
    private static String password = "";
    static Connection conn;
    static Connection Connect(){
        try {
            Class.forName(jdbc_driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected");
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Connection Failed:" + exception.getLocalizedMessage());
        } return conn;
    }
}
