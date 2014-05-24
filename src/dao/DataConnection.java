/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DataConnection {
    public Connection openConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://COMPUTER:1433;databaseName=HotelManagementSystem";
            String username = "sa";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        DataConnection dataConnection = new DataConnection();
        Connection conn = dataConnection.openConnection();
        if(conn != null){
            System.out.println("Connecting...");
        } else if (conn == null){
            System.out.println("Disconnect.");
        }
    }
}
