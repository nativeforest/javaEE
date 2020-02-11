package com.labsierra.util;

public interface OracleProvider {
	String username="NATIVE";
	String password="NATIVE";
	String connUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	String driverName = "oracle.jdbc.driver.OracleDriver";

}
