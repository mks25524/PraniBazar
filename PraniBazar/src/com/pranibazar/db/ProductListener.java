package com.pranibazar.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.pranibazar.bean.ProductBean;

/**
 * Application Lifecycle Listener implementation class ProductListener
 *
 */
@WebListener
public class ProductListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ProductListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
			Driver d=new com.mysql.jdbc.Driver();			
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalshop","root","root");
			ServletContext sc=sce.getServletContext();
			sc.setAttribute("connDB", con);
		}catch (Exception e) {
			// TODO: handle exception
		}
    	          
    }
	
}
