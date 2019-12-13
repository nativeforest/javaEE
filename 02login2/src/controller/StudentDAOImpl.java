package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDAOImpl implements StudentDAO {
	
	static Connection con;
	static PreparedStatement ps; 
	

	@Override
	public int insertStudent(Student s) {
		int status = 0;
	
		try {
			con = MyConnectionProvider.getCon();
			String query = "insert into student values (?,?,?,?,?) ";
			ps = con.prepareStatement(query);
		
			ps.setString(1, s.getName());  // userName
			ps.setString(2, s.getPassword());  //Password
			ps.setString(3,  s.getUserName());      //Name
			ps.setString(4, s.getCode());         //Code
			ps.setString(5, s.getEmail());     //Email
			status= ps.executeUpdate();
			
			System.out.println("status insert excute: "+status);
			con.commit();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e); 
			System.out.println("errorsaso en insertstudent");}
		
		return 0;	
	}
	
	@Override
	public Student getStudent(String userName, String password) {
		Student s = new Student();
		try {
			con = MyConnectionProvider.getCon();
			String query = "SELECT * FROM student WHERE username=? AND pass=?";
			ps = con.prepareStatement(query);	
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();			
		
			System.out.println("rsNext getstudent:"+rs); 
			
			while(rs.next()) {
			s.setName(rs.getString("STUDENT_NAME"));	
			s.setUserName(rs.getString("USERNAME"));
			s.setPassword(rs.getString("PASS")); 	
			s.setEmail(rs.getString("EMAIL"));       
			s.setCode(rs.getString("CODE")); 
			
			}con.close();
			
		
		}catch(Exception e) { 
			
			System.out.println(e);   
			System.out.println("errorsaso getstudent");
		}
		return s;
		
		
	}
	
	


	}


