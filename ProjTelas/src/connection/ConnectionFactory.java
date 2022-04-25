
package connection;
import java.sql.*;
import java.io.*;

public class ConnectionFactory {
    
     Connection con;
    PreparedStatement ps;

   
        public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancozilla", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
     return con;
}
}
   