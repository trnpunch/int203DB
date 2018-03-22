package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lambopunchh
 */
public class ConnectionBuilder {
    public static Connection connect() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SPK","SPK", "SPK");
            return con;
    }
    
     public static Connection getCon() {
        Connection conn=null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB203", "DB203", "db203");
        } catch (ClassNotFoundException ex) {
            System.out.println("error");
        } catch (SQLException ex) {
            System.out.println("error2");
        }
        return conn;
    }
    
}