<%@page import="com.pranibazar.bean.PurchaseBean"%>
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
			<td>User</td>
			<td>Bird Id</td>
			<td>Bird Name</td>
			<td>Catagories</td>
			<td>Available Quantity</td>
			<td>Price</td>
			<td>TrnxId</td>
			<td>Address</td>
			<td>Phone</td>
			<td>Status</td>
			
			</tr>
			<%
			List<PurchaseBean> list=(List)request.getAttribute("purchasedetails");
			for(PurchaseBean si:list)
				{
					%>
					<tr>
					<td><%=si.getUser() %></td>
						<td><%=si.getPid() %></td>
						
						<td><%=si.getPname()%></td>
						<td><%= si.getPcatagory() %></td>
						<td><%= si.getPquantity()%></td>
						<td><%= si.getPrice()%></td>
						<td><%=si.getTrnxid() %></td>
						 <td><%=si.getAddress()%></td>
						 <td><%=si.getPhone() %></td>
						 <td><a href="UpdatePurchaseServlet?user=<%=si.getUser()%>pname=<%=si.getPname()%>pcatagory=<%=si.getPcatagory()%>pquantity=<%=si.getPquantity()%>price=<%= si.getPrice()%>trnxid=<%=si.getTrnxid() %>address=<%=si.getAddress()%>phone=<%=si.getPhone() %>"><%=si.getStatus() %></a></td>
						 
					</tr>
					<% 
				}
			%>
		</table>

</body>
</html>