package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;
import model.StudentDAO;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
    public LoginRegister() {
        super();
   
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		/* login from _html login.jsp*/
		StudentDAO sd = new StudentDAOImpl();
		String userName = request.getParameter("login-userName"); 
		String password = request.getParameter("login-password"); 
		String submitType = request.getParameter("submit");
		Student s = new Student();
		 s = sd.getStudent(userName , password);
		 
		/*Login submit selected */
		if(submitType.equals("login") && s!=null && s.getName()!=null) {
			
			
			request.setAttribute("homeMessage"," login nice welcome!request.setA name:"+s.getName());
			HttpSession session=request.getSession();  
	        session.setAttribute("userName",s.getUserName()); 
			 
			request.getRequestDispatcher("studentHome").forward(request, response);
			
		   } 
	       /*Register submit selected*/  
		   else if ( submitType.equals("register") ){
			
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
		/*The servlet container will check the Cookie header of every incoming HTTP request*/
			request.setAttribute("registerSuccessMessage","_You hav been registered");
			request.getRequestDispatcher("login.jsp").forward(request,response);
			
			/* in login, user does not exist */
		}else {  			
			request.setAttribute("loginErrorMessage","fail password/user or _You are Not Registered yet,Click on Register");
			request.getRequestDispatcher("login.jsp").forward(request,response);
			
			}
		
	}

}
