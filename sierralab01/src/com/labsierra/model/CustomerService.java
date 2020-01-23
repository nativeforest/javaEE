package com.labsierra.model;
import java.util.ArrayList;
import java.util.List;
             /*CustomerDao*/
public class CustomerService {
	/*private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null; */

	
	

	public List<Customer> getAllCustomer(){
		List<Customer> customerList = new ArrayList<>();
		/*		con = ConnectionManager.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql); */
		// while(rs.next) retriving data
		customerList.add(new Customer("andres","29","globulos rojos") ); /*sql soon*/
		customerList.add(new Customer("brenda","22","frotis garganta") );
		customerList.add(new Customer("patricia","29","plaquetas") );
		customerList.add(new Customer("raul","56","hiper tension") );
		return customerList;
		
	}
	
	public Boolean userLoginValidate(String user,String password) { /*or (Student student)*/
		
		if(user=="andres" & password=="andres") {
			return true;
		}else return false;
	}
	
	public int deleteCustomer(String id) {
		
		return 0;  // if getit or doesnt exist 1
		
	}
public Customer getCustomer(int id) {
	
	Customer customer = new Customer("jason Becker","38","ALS"); /* sql query soon*/	
		return customer; /* return some customer*/
		
	} 
	
//	public static void viewTable(Connection con, String dbName)   //another way
//		    throws SQLException {
//
//		    Statement stmt = null;
//		    String query =
//		        "select COF_NAME, SUP_ID, PRICE, " +
//		        "SALES, TOTAL " +
//		        "from " + dbName + ".COFFEES";
//
//		    try {
//		        stmt = con.createStatement();
//		        ResultSet rs = stmt.executeQuery(query);
//		        while (rs.next()) {
//		            String coffeeName = rs.getString("COF_NAME");
//		            int supplierID = rs.getInt("SUP_ID");
//		            float price = rs.getFloat("PRICE");
//		            int sales = rs.getInt("SALES");
//		            int total = rs.getInt("TOTAL");
//		            System.out.println(coffeeName + "\t" + supplierID +
//		                               "\t" + price + "\t" + sales +
//		                               "\t" + total);
//		        }
//		    } catch (SQLException e ) {
//		        JDBCTutorialUtilities.printSQLException(e);
//		    } finally {
//		        if (stmt != null) { stmt.close(); }
//		    }
//		}
	
	
}
