
package project2;
import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getCon(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/japan","root","thiz123");
            return conn;
             
            
        }catch(Exception e){
            
            return null;
            
        }
        
        
        
    }
    
    
    
}
