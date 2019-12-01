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
			ps = con.prepareStatement("insert into register value(?,?,?,?,?)");
			ps.setString(1, s.getUserName());  // userName
			ps.setString(2, s.getName());      //Name
			ps.setString(3, s.getEmail());     //Email
			ps.setInt(4, s.getCode());         //Code
			ps.setString(5, s.getPassword());  //Password
			
			status= ps.executeUpdate();
			con.close();
			
		}catch(Exception e) {System.out.println(e);}
		
		return 0;	
	}

	
	@Override
	public Student getStudent(String userName, String password) {
		Student s = new Student();
		try {
			con = MyConnectionProvider.getCon();
			ps = con.prepareStatement("select * from student where userid=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				s.setUserName(rs.getString(1));     //userName
				s.setName(rs.getString(2));        //name;
				s.setEmail(rs.getString(3)); 	  //email;
				s.setCode(rs.getInt(4));         //code;
				s.setPassword(rs.getString(5)); //password;
			
			}
			
		}catch(Exception e) { System.out.println(e); }
		
		return null;
		
		
	}


	
	}


