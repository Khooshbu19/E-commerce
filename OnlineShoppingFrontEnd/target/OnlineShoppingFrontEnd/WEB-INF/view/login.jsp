
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style type="text/css">
body{

background-image:url(resources/images/pink_rice.png)

}
</style>
</head>
<body>

 <h1 class="well" align="center">
		
			<font face="Monotype Corsiva">sign up</font>
			
		
	</h1>
 <div align="center">
<form action="userLogin"  method="POST">
  <div class="form-group col-md-6">
    
    <input type="email" class="form-control" id="email" placeholder="email">
  </div>
  <div class="form-group col-md-6">
    
    <input type="password" class="form-control" id="u_password" placeholder="password">
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>	
	</div>						
</body>
</html>