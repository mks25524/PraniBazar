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

import com.pranibazar.db.ProductDaoImpl;
import com.pranibazar.db.ProductDetailsDao;


/**
 * Servlet implementation class ShowProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProduct() {
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
				ProductDetailsDao pname=new ProductDaoImpl(con);
				String s=request.getParameter("pcatagory");
				List<ProductBean> productlist=pname.getByCatagory(s);
				//PrintWriter pw=response.getWriter();
				
				request.setAttribute("search", productlist);
				request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
