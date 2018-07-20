
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
 <style>
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
      <form action="userLogin" method="POST">
       
       
        
          <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
          <div class="form-group col-md-6">
          <input id="email" type="text" class="form-control" name="email" placeholder="Email">
        </div>
        <br>
      
          <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
          <div class="form-group col-md-6">
			<input id="u_password" type="password" class="form-control" name="u_password" placeholder="Password">
        </div>
     
      <br>
   <button type="submit" class="btn btn-primary">LogIn</button>
  </form>
    </div>
  
  
									
</body>
</html>