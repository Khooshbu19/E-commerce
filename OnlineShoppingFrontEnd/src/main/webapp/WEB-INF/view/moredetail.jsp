<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath }/moredetail"  method="POST">
  <div class="card" style="width:400px">
    <img class="card-img-top" src="${pageContext.request.contextPath }/resources/images/${product.productId}.jpg" alt="Card image" style="width:100%">
    <div class="card-body">
      <h4 class="card-title"> Product Name:- ${product.productName}</h4>
      <p class="card-text">Descriptons:- ${product.productDescription}</p>
       <p class="card-text">price:- ${product.productPrice}.</p>
       </div>
       </div>
  </form:form>
</body>
</html>