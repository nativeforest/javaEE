package model;
import java.sql.Connection;
import java.sql.DriverManager;



public class MyConnectionProvider implements MyProvider {
	static Connection con=null;
	
	public static Connection getCon() {
		

		try {
	//		Class.forName ("oracle.jdbc.OracleDriver");
			//oracle.jdbc.driver.OracleDriver
			 Class.forName ("oracle.jdbc.driver.OracleDriver");
		
			//Class.forName ("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection(connUrl,password,username);
			
			 //con = DriverManager.getConnection
		       //       ("jdbc:oracle:thin:@localhost:1521/xe", "NATIVE", "NATIVE");
			
			}catch(Exception e)  {
			System.out.println(e);
		    }	
		return con;
	   }
	
	
}
