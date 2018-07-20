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

</head>
<style type="text/css">
body{

background-image:url(resources/images/pink_rice.png)

}

</style>
<body>

<h1 class="well">
		
			<font face="Monotype Corsiva">Supplier</font>
			
		
	</h1>		
	<hr>
			
<form:form action="${pageContext.request.contextPath }/supplier"  method="POST" modelAttribute="sup">

 <c:if test="${ not empty sup.supplierName}">
 <div class="form-group ">
           <form:hidden path="supplierId"/>
          
      </div>
 </c:if>      
<div class="form-row">
 <div class="form-group  col-md-4">
           <form:label path="supplierName">SupplierName:</form:label>
         <form:input  class="form-control" path="supplierName" />
       </div>
  
       
       <div class="form-group  col-md-4">
           <form:label path="supplierProduct">SupplierProduct:</form:label>
          <form:input   class="form-control" path="supplierProduct" />
          </div>
       
     </div>  
       
       
       
       	<c:if test="${ empty sup.supplierName }">		
      <div class="form-group">
     	 <form:button class="btn btn-primary">submit</form:button>
      </div>
         </c:if>
         <c:if test="${ not empty sup.supplierName }">		
    <div class="form-group">
     	 <form:button class="btn btn-primary">update</form:button>
        </div>
         </c:if>
            

   </form:form>
     <table align="center" border="1">
   <tr>
  <tr>
  <tr>
   
   <th>Supplier Name</th>
   <th>Supplier Product</th>
    
   <th>Actions on row</th>
   </tr>
   <c:forEach items="${supplierList}" var="supplier">
   <tr>
      <td>${supplier.supplierName}</td>
   <td>${supplier.supplierProduct}</td>
  
   <td align="center"><a href="editsupplier/${supplier.supplierId}">Edit</a> | <a href="deletesupplier/${supplier.supplierId}">Delete</a></td>
   </tr>
   </c:forEach>
   </table>

  </body>
</html>