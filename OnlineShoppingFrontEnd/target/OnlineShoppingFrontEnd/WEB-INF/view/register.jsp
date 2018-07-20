<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
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
<jsp:include page="navbar.jsp"></jsp:include>
<form:form action="${pageContext.request.contextPath }/register"  method="POST" modelAttribute="reg">

<h1 class="well" align="center">
		
			<font face="Monotype Corsiva">User Information</font>
			
		
	</h1>
	

<div class="form-row ">
    <div class="form-group  col-md-4">
   
         <form:label path="u_firstname">First Name:</form:label>
      	<form:input class="form-control" path="u_firstname" />
         </div> 
         <div class="form-group col-md-4">
   
         <form:label path="u_lastname">Last Name:</form:label>
      	<form:input class="form-control" path="u_lastname" />
         </div> 
   </div>      
<div class="form-row ">
<div class="form-group col-md-4">
	
		<form:label path="email">Email</form:label>
		
		<form:input  class="form-control" path="email"/>
		</div>

<div class="form-group col-md-4">

		<form:label path="u_password">password</form:label>
		
		<form:input type="password" class="form-control" path="u_password"/>
</div>





<div class="form-group col-md-2">

		<form:label path="mobile_no">Contact no:-</form:label>
		
		<form:input  class="form-control" path="mobile_no"/>
		
</div>

</div>
<h1 class="well" align="center">
	
			<font face="Monotype Corsiva">Shipping Address</font>
			
		
	</h1>
	<div class="form-row ">	
<div class="form-group col-md-4 ">

		<form:label path="shippingAddress.streetName">Street Name</form:label>
		<form:input class="form-control" path="shippingAddress.streetName"/>
</div>





<div class="form-group col-md-4">


		<form:label path="shippingAddress.city">city</form:label>
		<form:input class="form-control" path="shippingAddress.city"/>
</div>

<div class="form-group col-md-2">

		<form:label path="shippingAddress.apartNo">Apartment number</form:label>
		<form:input class="form-control" path="shippingAddress.apartNo"/>

</div>

</div>
 <div class="form-row">
<div class="form-group  col-md-4">

		<form:label path="shippingAddress.state">state</form:label>
		<form:input class="form-control" path="shippingAddress.state"/>
</div>
<div class="form-group col-md-4">

		<form:label class="col-sm-2 control-label" path="shippingAddress.country">Country</form:label>
		<form:input class="form-control" path="shippingAddress.country"/>
</div>
<div class="form-group col-md-2">

		<form:label path="shippingAddress.zipcode">Zip Code</form:label>
		<form:input class="form-control" path="shippingAddress.zipcode"/>
</div>
</div>
<h1 class="well" align="center">

				<font face="Monotype Corsiva">Billing Address</font>


			</h1>	
<div class="form-row">
<div class="form-group col-md-4">

		<form:label path="billingAddress.streetName">Street Name</form:label>
		<form:input class="form-control" path="billingAddress.streetName"/>
</div>
<div class="form-group col-md-4">

		<form:label path="billingAddress.city">city</form:label>
		<form:input class="form-control" path="billingAddress.city"/>


</div>
<div class="form-group col-md-2">

		<form:label path="billingAddress.apartNo">Apartment_no</form:label>
		<form:input class="form-control" path="billingAddress.apartNo"/>


</div>
</div>
<div class="form-row">
<div class="form-group col-md-4">

		<form:label path="billingAddress.state">state</form:label>
		<form:input  class="form-control" path="billingAddress.state"/>
</div>


<div class="form-group col-md-4">
		<form:label path="billingAddress.country">Country</form:label>
		<form:input class="form-control" path="billingAddress.country"/>
		</div>


<div class="form-group col-md-2">

		<form:label path="billingAddress.zipcode">Zip Code</form:label>
		<form:input class="form-control" path="billingAddress.zipcode"/>
</div>


</div>


     <form:button type="submit" class="btn btn-primary">Submit</form:button>
    
     
 
</form:form>
 
</body>
</html>