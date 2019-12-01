package controller;

public interface StudentDAO {
	
	public int insertStudent(Student s);
    Student getStudent(String userName,String password);
	
	
}
 