package com.pranibazar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pranibazar.db.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		request.getRequestDispatcher("btlogout.html").include(request, response);

		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		if(name.equals("sohag"))
		{
			if(LoginDao.validateAdmin(name, pass)) {
			pw.print("Welcome"+name);
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			request.getRequestDispatcher("btlogout.html").include(request, response);

				RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
				rd.forward(request, response);
			}else {
				pw.print("Sorry username or password error");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}else
		{
			if(LoginDao.validate(name, pass)) {
				pw.print("welcome"+name);
				HttpSession session=request.getSession();
				session.setAttribute("name", name);
				RequestDispatcher rd=request.getRequestDispatcher("userProfile.jsp");
				rd.forward(request, response);
			}else {
				pw.print("Sorry username or password error");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
		}
		
		pw.close();
	}

}
