package com.pranibazar.controller;

import java.io.IOException;

import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pranibazar.bean.ProductBean;
import com.pranibazar.bean.PurchaseBean;
import com.pranibazar.db.ProductDaoImpl;
import com.pranibazar.db.ProductDetailsDao;
import com.pranibazar.db.PurchaseDao;
import com.pranibazar.db.PurchaseDaoImpl;


/**
 * Servlet implementation class ShowProduct
 */
@WebServlet("/ShowPurchaseDetailsUser")
public class ShowPurchaseDetailsUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPurchaseDetailsUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				ServletContext sc=getServletContext();
				Connection con=(Connection)sc.getAttribute("connDB");
				PurchaseDao pname=new PurchaseDaoImpl(con);
				List<PurchaseBean> purchaselist=pname.getAllRecord();
				//PrintWriter pw=response.getWriter();
				
				request.setAttribute("purchasedetails", purchaselist);
				request.getRequestDispatcher("UserPurchaseDetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
