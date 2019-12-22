

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/studentHome")
public class StudentHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public StudentHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);  
		
		   if(session!=null){  
			   String userName = (String)session.getAttribute("userName");
			   
		          //TODO create servlet with html, example use write html inside servlet
			   request.getRequestDispatcher("student_home.jsp").include(request, response);
		    	response.setContentType("text/html");  
		        PrintWriter out=response.getWriter(); 
		        out.print("<h1>Settings</h1>");
		        out.print("session studenthome servlet: "+userName);
		        
		        
		         
		        out.close(); 
		        }  
		        else{  
		        	response.setContentType("text/html");  
			        PrintWriter out=response.getWriter(); 
			        out.print("<h1>Settings</h1>");
			        out.print("session studenthome servlet session null:username none! ");
			        
			        out.close();
		            request.getRequestDispatcher("login.jsp").include(request, response);  
		        }
	}

	

}
