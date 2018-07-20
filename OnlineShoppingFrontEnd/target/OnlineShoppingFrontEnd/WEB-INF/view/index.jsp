<html>
<head>
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
  /* Make the image fully responsive */
  .carousel-inner img {
      width: 100%;
      height: 70%;
  }
</style>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  
  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
     <img src="resources/images/tbook.jpg" class="rounded" alt="Cinque Terre">
    </div>
    <div class="carousel-item">
      <img src="resources/images/summer.jpg" alt="Chicago" >
    </div>
    <div class="carousel-item">
      <img src="resources/images/new_series.jpg" alt="New York" >
    </div>
  </div>
  
  
  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>

<jsp:include page="card1.jsp"></jsp:include>



<jsp:include page="card2.jsp"></jsp:include>
<div class="container">
  <div class="footer-copyright text-center py-3">© 2018 Copyright:
      <a href="https://mdbootstrap.com/bootstrap-tutorial/"> MDBootstrap.com</a>
      <i class="fa fa-twitter" style="font-size:36px"></i>
      <i class="fa fa-facebook-square" style="font-size:36px"></i>
      <i class="fa fa-instagram" style="font-size:36px"></i>
    </div>
   </div>
</body>
</html>
