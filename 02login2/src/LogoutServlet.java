

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if(session!=null){ 
			session.invalidate();
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        out.close();  
        
		request.getRequestDispatcher("login.jsp").forward(request, response);
		//HttpSession session=request.getSession();  
        
        out.print("You are successfully logged out! ->"+ session); }else {
        	 request.getRequestDispatcher("login.jsp").include(request, response);		
        	response.setContentType("text/html");  
	        PrintWriter out=response.getWriter(); 
	        out.print("<h1>----</h1>");
	        out.print("else logoutservlet u  are currently logout! ");
	        
	        out.close();
             
        	
        } 
		 request.getRequestDispatcher("login.jsp").include(request, response);	
        
       
        
	}

}
