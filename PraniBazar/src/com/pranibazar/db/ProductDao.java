package com.pranibazar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pranibazar.bean.ProductBean;
import com.pranibazar.bean.RegisterBean;

public class ProductDao {
	public static Connection geConnection()
	{
		 Connection con=null;
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalshop","root","root");
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 return con;
	}
	
	public static int addProduct(ProductBean pb)
	{
		 int status=0;
		 try
		 {
			 Connection con=RegisterDao.geConnection();
			 PreparedStatement pst=con.prepareStatement("insert into product_details_25524(pid,pname,pcatagory,pquantity,price,pimage)values(?,?,?,?,?,?)");
			 pst.setString(1, pb.getPid());
			 pst.setString(2, pb.getPname());
			 pst.setString(3, pb.getPcatagory());
			 pst.setString(4, pb.getPquantity());
			 pst.setDouble(5, pb.getPrice());
			 pst.setBlob(6, pb.getPimage());
			
			 status=pst.executeUpdate();
			 con.close();
			 
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 return status;
	}
}
