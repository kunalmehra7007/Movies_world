/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies_world;

import java.sql.*;


/**
 *
 * @author Kunal Mehra
 */
public class DBLoader {
    public static ResultSet executeSQL(String sql)
    {
        try
        {
            /////////////////    ## Code    //////////////
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loading done");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/movies_db", "root", "km1805609");
//            System.out.println("Connection done");
            
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            System.out.println("Statement done");
            
            ResultSet rs = stmt.executeQuery(sql);
//            System.out.println("ResultSet Created");   
            
            return rs;
           
           /////////////// ## Code Ends Here ////////////
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            
            return null;
        }
    }
}
