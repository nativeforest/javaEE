

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProfileServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);  
		
		   if(session!=null){  
		        String name = (String)session.getAttribute("userName");  
		          //TODO create servlet with html, example use write html inside servlet
		    	response.setContentType("text/html");  
		        PrintWriter out=response.getWriter(); 
		        out.print("<h1>Settings profile servlet</h1>");
		        out.print("session Profileservlet: "+name);
		        request.getRequestDispatcher("student_profile.jsp").include(request, response);
		        out.close(); 
		       
		        }  
		        else{  
		             
		            request.getRequestDispatcher("login.jsp").include(request, response); 
		            
		        }
		
		
	}

}
