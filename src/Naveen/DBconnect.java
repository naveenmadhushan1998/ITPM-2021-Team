
package Naveen;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;




public class DBconnect {
    public static Connection connect(){
    
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try 
        {
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName("java.sql.Drivermanager");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb","root","");
        
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        return conn;
    }

    
    
}
