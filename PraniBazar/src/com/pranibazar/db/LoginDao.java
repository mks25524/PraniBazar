package com.pranibazar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 

public class LoginDao {
 public static boolean validate(String username,String pass) {
	 boolean status=false;
	 try
	 {
		 Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalshop","root","root");
		PreparedStatement ps=con.prepareStatement("select * from user_reg where username=? and password=?");
		ps.setString(1, username);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 return status;
 }
}
