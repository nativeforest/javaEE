package com.labsierra.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements OracleProvider {
	private static Connection con=null;

	public static Connection getConnection() {
		 
		
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(connUrl, username, password);
            } catch (SQLException ex) {
                
                System.out.println("Failed to create the Oracle database connection."); 
            }
        } catch (ClassNotFoundException ex) {
           
            System.out.println("Oracle driver not found."); 
        }
        return con;
    }
}
