package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
    public LoginRegister() {
        super();
   
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		//// login from _html login.jsp/////
		StudentDAO sd = new StudentDAOImpl();
		String userName = request.getParameter("login-userName"); 
		String password = request.getParameter("login-password"); 
		String submitType = request.getParameter("submit");
		Student s = new Student();
		 s = sd.getStudent(userName , password);
		 
		System.out.println("-----------------");
		System.out.println(" s getna: "+s.getName()+" pass: "+s.getPassword());	
		System.out.println("-----");
		
		if(submitType.equals("login") && s!=null && s.getName()!=null) {
			request.setAttribute("homeMessage",s.getName());
			request.getRequestDispatcher("student_home.jsp").forward(request, response);
		
		}else if ( submitType.equals("register") ){
			
			s = new Student();
			
			String userNameR = request.getParameter("register-userName");
			String passwordR = request.getParameter("register-password");
			String nameR = request.getParameter("register-name");
			String codeR = request.getParameter("register-code");
			String emailR = request.getParameter("register-email");
			s.setUserName(userNameR);
			s.setPassword(passwordR);
			s.setName(nameR);
			s.setCode(codeR);
			s.setEmail(emailR);
			sd.insertStudent(s);
		
			request.setAttribute("registerSuccessMessage","_You hav been registered");
			request.getRequestDispatcher("login.jsp").forward(request,response);
			
			
		}else {  			
			request.setAttribute("loginErrorMessage","_You are Not Registered yet,Click on Register");
			request.getRequestDispatcher("login.jsp").forward(request,response);
			}
		
	}

}
