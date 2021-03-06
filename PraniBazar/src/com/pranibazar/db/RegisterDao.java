package com.pranibazar.db;


import java.sql.*;

import com.pranibazar.bean.RegisterBean;

public class RegisterDao {
	//for setting up connection
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
//for register (insert register form value into user table)
public static int register(RegisterBean rb)
{
	 int status=0;
	 try
	 {
		 Connection con=RegisterDao.geConnection();
		 PreparedStatement pst=con.prepareStatement("insert into user_reg(name,username,email,phone,address,password)values(?,?,?,?,?,?)");
		 pst.setString(1, rb.getName());
		 pst.setString(2, rb.getUsername());
		 pst.setString(3, rb.getEmail());
		 pst.setString(4, rb.getPhone());
		 pst.setString(5, rb.getAddress());
		 pst.setString(6, rb.getPassword());
		
		 status=pst.executeUpdate();
		 con.close();
		 
	 }catch(SQLException e)
	 {
		 e.printStackTrace();
	 }
	 return status;
}
//for admin register
public static int registerAdmin(RegisterBean rb)
{
	 int status=0;
	 try
	 {
		 Connection con=RegisterDao.geConnection();
		 PreparedStatement pst=con.prepareStatement("insert into admin(name,username,email,phone,address,password)values(?,?,?,?,?,?)");
		 pst.setString(1, rb.getName());
		 pst.setString(2, rb.getUsername());
		 pst.setString(3, rb.getEmail());
		 pst.setString(4, rb.getPhone());
		 pst.setString(5, rb.getAddress());
		 pst.setString(6, rb.getPassword());
		
		 status=pst.executeUpdate();
		 con.close();
		 
	 }catch(SQLException e)
	 {
		 e.printStackTrace();
	 }
	 return status;
}
}
