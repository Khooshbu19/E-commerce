<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

 <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="">BOOK STORE</a>
 <!-- <a href="index" ><i class="fa fa-home" style="font-size:48px,color:white" ></i></a>-->
  <!-- Links -->
  <ul class="navbar-nav ">
  <li class="nav-item " >
     <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Category
      </a>
      <div class="dropdown-menu">
     
     <c:forEach items="${categoryList}" var="category">
            
           <a class="dropdown-item" href="${pageContext.request.contextPath}/productdetails/${category.categoryId}">${category.categoryId}</a>
  
           </c:forEach>
        </div>
        </li>
  <security:authorize access="isAnonymous()">
     <li class="nav-item" >
      <a class="nav-link" href="register" >Sign up <i class="fa fa-user" aria-hidden="true"></i></a>
    </li>
   
    <li class="nav-item">
      <a class="nav-link" href="login">login</a>
    </li>
    </security:authorize>
 <security:authorize access="isAuthenticated()" >
  <li class="nav-item">
      <a class="nav-link" href="logout">logout</a>
    </li>
 </security:authorize>
    <!-- Dropdown -->
  
   
    </ul>
</nav>
     

</body>
</html>