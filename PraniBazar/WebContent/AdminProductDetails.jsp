<%@page import="com.pranibazar.bean.ProductBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bird Details</title>
</head>
<body>
<center>Bird  Details</center>
		<table align="center" border="1">
			<tr>
			<td>Bird Id</td>
			<td>Bird Name</td>
			<td>Catagories</td>
			<td>Available Quantity</td>
			<td>Price</td>
			<td>Image</td>
			
			</tr>
			<%
			List<ProductBean> list=(List)request.getAttribute("productlistdetailsadmin");
			for(ProductBean si:list)
				{
					%>
					<tr>
						<td><%=si.getPid() %></td>
						
						<td><%=si.getPname()%></td>
						<td><%= si.getPcatagory() %></td>
						<td><%= si.getPquantity()%></td>
						<td><%= si.getPrice()%></td>
						
						<td><img alt="img" src="GetImage?pname=<%=si.getPname() %>" width=100 height=100></td>
						<td><a href="">Update</a> </td>
					</tr>
					<% 
				}
			%>
		</table>

</body>
</html>