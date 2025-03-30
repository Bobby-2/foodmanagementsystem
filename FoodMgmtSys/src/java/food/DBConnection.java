
package food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConnection {
    Connection con;
    public DBConnection() {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb","root","");
           
        } catch (ClassNotFoundException | SQLException ex){
                
            System.out.println("ERROR" +ex);
        }
    }
    public Connection getCon(){
        return con;
    }
}