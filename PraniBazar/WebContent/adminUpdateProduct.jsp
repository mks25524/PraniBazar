<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Add Product</title>
</head>
<body>
<form class="form-horizontal" action="UpdateProductAdminServlet" method="post" enctype="multipart/form-data">
<fieldset>

<!-- Form Name -->
<legend>PRODUCTS</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_id"><%=request.getParameter("pid") %></label>  
  <div class="col-md-4">
  <input id="product_id" name="product_id" value="<%=request.getParameter("pid") %>" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
  <div class="col-md-4">
  <input id="product_name" name="product_name" placeholder="PRODUCT NAME" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_categorie">PRODUCT CATEGORY</label>
  <div class="col-md-4">
    <select id="product_categorie" name="product_categorie" class="form-control">
    <option value="dove">Dove</option>
    <option value="duck">Duck</option>
    <option value="goose">Goose</option>
    <option value="lovebird">Lovebird</option>
    <option value="pigeon">Pigeon</option>
    <option value="peacock">Peacock</option>
    <option value="owl">Owl</option>
    <option value="toucan">Toucan</option>
    
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">AVAILABLE QUANTITY</label>  
  <div class="col-md-4">
  <input id="available_quantity" name="quantity" placeholder="AVAILABLE QUANTITY" class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_weight">PRODUCT Price</label>  
  <div class="col-md-4">
  <input id="product_weight" name="product_price" placeholder="PRODUCT WEIGHT" class="form-control input-md" required="" type="text">
    
  </div>
</div>















 <!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">product_image</label>
  <div class="col-md-4">
    <input id="filebutton" name="product_image" class="input-file" type="file">
  </div>
</div>


<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="save" class="btn btn-primary">Save</button>
  </div>
  </div>

</fieldset>
</form>

</body>
</html>