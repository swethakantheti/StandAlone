package test;


import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swetha kantheti
 */
public class DatabaseConnection {
    public static java.sql.Connection dbConnection() throws ClassNotFoundException, SQLException{
        java.sql.Connection conn=null;
        String url="jdbc:mysql://localhost:3306/pcs";
        Class.forName("com.mysql.jdbc.Driver");
        conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
        return conn;
    }
}
