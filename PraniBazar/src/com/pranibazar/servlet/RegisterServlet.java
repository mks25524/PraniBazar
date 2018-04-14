package com.pranibazar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pranibazar.bean.RegisterBean;
import com.pranibazar.db.RegisterDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		 PrintWriter pw=response.getWriter();
		 String name=request.getParameter("name");
		 String username=request.getParameter("user_name");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		 String address=request.getParameter("address");
		 String adminCheck=request.getParameter("admin");
		 
		 RegisterBean rb=new RegisterBean();
		 rb.setName(name);
		 rb.setUsername(username);
		 rb.setEmail(email);
		 rb.setPhone(phone);
		 rb.setAddress(address);
		 rb.setPassword(password);
		 if(adminCheck.equals("admin"))
		 {
			 int status=RegisterDao.registerAdmin(rb);
			 if(status>0)
			 {
				 pw.print("<p><color='green'>Registerd successfully</color></p>");
				 request.getRequestDispatcher("details.html").include(request, response);
			 }else
			 {
				 pw.println("sorry, Registered unsuccessful");
			 }
			 pw.close(); 
		 }else {
			 int status=RegisterDao.register(rb);
			 if(status>0)
			 {
				 pw.print("<p><color='green'>Registerd successfully</color></p>");
				 request.getRequestDispatcher("index.html").include(request, response);
			 }else
			 {
				 pw.println("sorry, Registered unsuccessful");
			 }
			 pw.close();
		 }
		 
		
	}

}
