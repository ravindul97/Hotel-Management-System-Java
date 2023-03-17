/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */
public class dbconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/hm","root"," ");
         System.out.println("Connected");
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        return conn;
        
    }
    
}
