package banking;


import java.sql.*;
/**
 *
 * @author DEEPTIRANJAN SWAIN
 */
public class Connection_Provider {
    Connection conn;
    Statement stmt;

    public Connection_Provider() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking?characterEncoding=latin1", "root", "Happy");
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }


}
