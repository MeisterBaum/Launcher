/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAMLALL
 */
public class MySQLConnect {
    public static Connection ConnectDB() throws ClassNotFoundException{
        Connection conn;
        try{
              Class.forName("com.mysql.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/");
              return conn;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
               return null;
    }
}
