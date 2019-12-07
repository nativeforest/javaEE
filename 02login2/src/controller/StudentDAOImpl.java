package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentDAOImpl implements StudentDAO {
	
	static Connection con;
	static PreparedStatement ps; 

	@Override
	public int insertStudent(Student s) {
		int status = 0;
	
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?) ");
			//ps = con.prepareStatement("insert into register value(?,?,?,?,?)");
			System.out.println("insert statement ready");
			ps.setString(1, s.getName());  // userName
			ps.setString(2, s.getPassword());  //Password
			ps.setString(3,  s.getUserName());      //Name
			ps.setString(4, s.getCode());         //Code
			ps.setString(5, s.getEmail());     //Email
	
			
			status= ps.executeUpdate();
			System.out.println("status insert excute: "+status);
			con.commit();
			con.close();
			
		}catch(Exception e) {System.out.println(e);  System.out.println("errorsaso en insertstudent");}
		
		return 0;	
	}

	
	@Override
	public Student getStudent(String userName, String password) {
		Student s = new Student();
		try {
			
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("select * from STUDENT where username =? and password =?");
			ps.setString(1, userName);
			ps.setString(2, password);
			System.out.println("--getStudent param- query--"); 
			System.out.println(userName); 
			System.out.println(password); 
			
			ResultSet rs = ps.executeQuery();
			System.out.println("--get studenquery executed--"); 
			while(rs.next()) {
				System.out.println("rs next while"); 
				s.setUserName(rs.getString("username"));     //userName3	
				s.setName(rs.getString(1));        //name;
				s.setEmail(rs.getString(5)); 	  //email;
				s.setCode(rs.getString(4));         //code;
				s.setPassword(rs.getString("password")); //password;
				
				
			} con.commit(); con.close(); System.out.println("--get studenquery clossesd--"); 
			
		}catch(Exception e) { System.out.println(e);   System.out.println("errorsaso getstudent");}
		return s;
		
		
		
	}


	
	}


