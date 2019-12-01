package controller;
import java.sql.Connection;
import java.sql.DriverManager;



public class MyConnectionProvider implements MyProvider {
	
	public static Connection getCon() {
		

		try {
			
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection(connUrl,password,username);
			
			}catch(Exception e)  {
			System.out.println(e);
		    }	
		return con;
	   }
	
	static Connection con=null;
}
