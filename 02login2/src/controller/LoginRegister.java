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
	   //// login from html login.jsp/////
		StudentDAO sd = new StudentDAOImpl();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String submitType = request.getParameter("subtmit");
		Student s = sd.getStudent(userName , password);
		if(submitType.equals("login")) { 
			
		}else if (submitType.equals("register")){
			
		}else { request.setAttribute("message","s");}
		
	}

}
