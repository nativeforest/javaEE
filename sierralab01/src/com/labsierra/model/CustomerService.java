package com.labsierra.model;
import java.util.ArrayList;
import java.util.List;
public class CustomerService {
	

	public List<Customer> getAllCustomer(){
		List<Customer> customerList = new ArrayList<>();
		// connec stm 
		//todo sql query
		// while(rs.next) retriving data
		customerList.add(new Customer("andres","29","globulos rojos") );
		customerList.add(new Customer("brenda","22","frotis garganta") );
		customerList.add(new Customer("patricia","29","plaquetas") );
		customerList.add(new Customer("raul","56","hiper tension") );
		return customerList;
		
	}
	
	public Boolean userLoginValidate(String user,String password) {
		
		if(user=="andres" & password=="andres") {
			return true;
		}else return false;
	}
	
//	public static void viewTable(Connection con, String dbName)
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
