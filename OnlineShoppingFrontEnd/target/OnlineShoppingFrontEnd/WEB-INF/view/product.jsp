<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style type="text/css">
body{

background-image:url(resources/images/pink_rice.png)

}

</style>
</head>
<body>
<h1 class="well">
		
			<font face="Monotype Corsiva">Product</font>
			
		
	</h1>	
	<hr>
	

<form:form action="${pageContext.request.contextPath }/product"  method="POST" modelAttribute="p" enctype="multipart/form-data">


  <c:if test="${ not empty p.productName}">
 <div class="form-group  ">
          <form:hidden path="productId"/>
     </div>     
      
   </c:if>    
 <div class="form-row">
 <div class="form-group  col-md-4">
           <form:label path="productName">ProductName:</form:label>
           <form:input  class="form-control"  path="productName" />
      </div>
       
       
     
       <div class="form-group  col-md-4">
          <form:label path="productDescription">Product Description:</form:label>
           <form:input  class="form-control"  path="productDescription" />
           </div>
  
         <div class="form-group  col-md-2">
           <form:label path="productPrice">ProductPrice:</form:label>
           <form:input  class="form-control"  path="productPrice" />
      </div>
      </div>
       <div class="form-row">
         <div class="form-group  col-md-4">
     
                    <form:select   class="form-control" path="categoryId" >
                        <form:option  value="">Select category</form:option> 
                        <c:forEach items="${categoryList}" var="category">
                            <form:option   value="${category.categoryId}"  >${category.categoryName}</form:option>
                        </c:forEach>
                    </form:select>
                </div>
                
               <div class="form-group  col-md-4">
                    <form:select  class="form-control"  path="supplierId" >
                        <form:option  value="">Select supplier</form:option> 
                        <c:forEach items="${supplierList}" var="supplier">
                            <form:option   value="${supplier.supplierId}"  >${supplier.supplierName}</form:option>
                        </c:forEach>
                    </form:select>
               </div>
              
    		 <div class="form-group  col-md-2">
               <form:input   class="form-control"  type="file" path="image" />
        	</div>
      </div>
  		<c:if test="${ empty p.productName }">		
       <div class="form-group  ">
     	<form:button class="btn btn-primary">submit</form:button>
         </div>
         </c:if>
         <c:if test="${ not empty p.productName }">		
       	 <div class="form-group ">
     	<form:button class="btn btn-primary">update</form:button>
         </div>
         </c:if>
  
   </form:form>
   
    
    <table align="center" border="1">
   <tr>
  <tr>
  <tr>
   
   <th>Product Name</th>
   <th>Product Price</th>
   <th>Product Description</th>   
   <th>Product Image</th> 
   <th>Actions on row</th>
   
   </tr>
   <c:forEach items="${productList}" var="product">
   <tr>
      <td>${product.productName}</td>
      <td>${product.productPrice}</td>
   <td>${product.productDescription}</td>
  <td> <img src="resources/images/${product.productId}.jpg"/></td>
   <td align="center"><a href="update/${product.productId}">Edit</a> | <a href="deleteproduct/${product.productId}">Delete</a></td>
   
   
   </tr>
   </c:forEach>
   

   				
   </table>
   
  </body>
</html>