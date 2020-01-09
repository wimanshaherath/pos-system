/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wimansha
 */
public class SQLCON {
    
    
    public static Connection connect()
    {
        Connection con= null;
                
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useUnicode=true&characterEncoding=UTF-8","root","");
        }
        catch(Exception ex)
        {
            
        }
        
        return con;
    }
   
    
}
