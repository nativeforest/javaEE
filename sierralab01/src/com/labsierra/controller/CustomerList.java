package com.labsierra.controller;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.labsierra.model.Customer;
import com.labsierra.model.CustomerService;

/**
 * Servlet implementation class CustomerList
 */
@WebServlet("/CustomerList")
public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService = new CustomerService();
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Customer> customerList = customerService.getAllCustomer();
		request.setAttribute("customerList", customerList);
		request.getRequestDispatcher("/pacientes/pacientes.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<body>");
        out.print("<h1>Settings</h1>");
        out.print("<h2>customerList</h1> ");
        out.print("</body>");
        out.print("</html>");
        out.close(); 
		
		
		//processRequest(request, response);
	}

}
