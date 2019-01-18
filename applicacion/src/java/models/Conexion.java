/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.DriverManager;
import java.sql.Connection;



/**
 *
 * @author user
 */
public class Conexion {
    private static String username = "root";
    private static String password = "";
    private static String hostname = "localhost";
    private static String port = "3306";
    private static String database = "carritojsp";
    
     private static String url = "jdbc:mysql://" + hostname +":"+port+"/" + database;
   
    private Connection conn;
    
   public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return this.conn;
    }
}
