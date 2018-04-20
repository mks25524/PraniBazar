package com.pranibazar.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.pranibazar.bean.ProductBean;
import com.pranibazar.db.ProductDao;
import com.pranibazar.db.RegisterDao;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
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
		 //for image
		 Part part=request.getPart("product_image");
			InputStream inputStream = part.getInputStream();
			
			ProductBean pb=new ProductBean();
			pb.setPid(pid);
			pb.setPname(pname);
			pb.setPcatagory(pcatagory);
			pb.setPquantity(pquantity);
			pb.setPrice(price);
			pb.setPimage(inputStream);
			 int status=ProductDao.addProduct(pb);
			 if(status>0)
			 {
				 pw.print("<p><color='green'>Product added successfully</color></p>");
				 request.getRequestDispatcher("admin.html").include(request, response);
			 }else
			 {
				 pw.println("sorry, Product adding unsuccessful.Please try again");
				 request.getRequestDispatcher("AddProduct.html").include(request, response);
			 }
			 pw.close();
			
	}else
		{pw.print("Please login first");  
        request.getRequestDispatcher("login.html").include(request, response);  
        }}

}
