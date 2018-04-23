<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<title>Purchase Form</title>
</head>
<body>
<h1><%=request.getParameter("pnames") %></h1>
<form class="form-horizontal" action="PurchaseServlet" method="post" >
<fieldset>

<!-- Form Name -->
<legend>Purchase</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="user">User Id</label>  
  <div class="col-md-4">
  <input id="user" name="user" value="<%=session.getAttribute("name") %>" placeholder="<%=session.getAttribute("name") %>" class="form-control input-md" type="text">
    
  </div>
</div>
 

<div class="form-group">
  <label class="col-md-4 control-label" for="product_id">PRODUCT ID</label>  
  <div class="col-md-4">
  <input id="product_id" name="product_id" value="<%=request.getParameter("pid") %>" placeholder="<%=request.getParameter("pid") %>" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
  <div class="col-md-4">
  <input id="product_name" name="product_name"value="<%=request.getParameter("pnames") %>" placeholder="<%=request.getParameter("pnames") %>"+class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Select Basic -->
 
<div class="form-group">
  <label class="col-md-4 control-label" for="product_categorie">Product Category</label>  
  <div class="col-md-4">
  <input id="product_categorie" name="product_categorie"value="<%=request.getParameter("pcatagory") %>" placeholder="<%=request.getParameter("pcatagory")%>" class="form-control input-md" required="" type="text"onclick="getTotal()">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_qn">Quantity</label>  
  <div class="col-md-4">
  <input id="product_qn" name="quantity"value="<%=request.getParameter("pquantity") %>" placeholder="<%=request.getParameter("pquantity") %>" class="form-control input-md" required="" type="text"onclick="getTotal()">
    
  </div>
</div>
 
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_pr">Price </label>  
  <div class="col-md-4">
  <input id="product_pr" name="product_price"value="<%=request.getParameter("price") %>" placeholder="<%=request.getParameter("price") %>" class="form-control input-md" required="" type="text"onclick="getTotal()">
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">TrxnId</label>  
  <div class="col-md-4">
  <input id="available_quantity" name="trnxid" placeholder="Transaction Id" class="form-control input-md" required="" type="text">
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">Address</label>  
  <div class="col-md-4">
  <input id="available_quantity" name="address" placeholder="Address" class="form-control input-md" required="" type="text">
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">Phone</label>  
  <div class="col-md-4">
  <input id="available_quantity" name="phone" placeholder="Phone Number" class="form-control input-md" required="" type="text">
    
  </div>
</div>
 


















<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="save" class="btn btn-primary">Purchase</button>
  </div>
  </div>

</fieldset>
</form>

</body>
</html>