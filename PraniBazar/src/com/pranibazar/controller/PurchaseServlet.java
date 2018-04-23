package com.pranibazar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pranibazar.bean.PurchaseBean;
import com.pranibazar.db.PurchaseDao;
import com.pranibazar.db.PurchaseDaoImpl;

/**
 * Servlet implementation class PurchaseServlet
 */
@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseServlet() {
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
				 HttpSession session=request.getSession(false);  
			        if(session!=null){ 
			        
			        String name=(String)session.getAttribute("name");  
				 
				 String pid=request.getParameter("product_id");
				 String pname=request.getParameter("product_name");
				 String pcatagory=request.getParameter("product_categorie");
				 String pquantity=request.getParameter("quantity");
				 double price=Double.parseDouble(request.getParameter("product_price"));
				 String trnxid=request.getParameter("trnxid");
				 String address=request.getParameter("address");
				 String phone=request.getParameter("phone");
				 String user=request.getParameter("user");
				 
				 String status="pending";
				 PurchaseBean pb=new PurchaseBean(pid,pname,pcatagory,pquantity,price,trnxid,address,phone,user,status);
				 ServletContext sc=getServletContext();
					Connection con=(Connection)sc.getAttribute("connDB");
					PurchaseDao pd=new PurchaseDaoImpl(con);
					int statuss=pd.insert(pb);
					if(statuss==1)
					{
					pw.println("<center><font color='green'>Purchased Successfully.......</font></center>");
					request.getRequestDispatcher("userProfile.jsp").include(request, response);
					}
					else {
						pw.println("<center><font color='green'>sorry try again ......</font></center>");
						request.getRequestDispatcher("purchase.jsp").include(request, response);
					}
				 
				 
	}

}}
