package controller;

public class Student {
private String userName;
	private String name;
	private String email;
	private int code;
	private String password;
	
	public String getUserName() { return userName;}
	public void setUserName(String userName) { this.userName = userName; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public int getCode() {return code;}
	public void setCode(int code) {this.code =code;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
}
