<%@page language="java" %>

<html>
<head>

<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>


  <!-- Using normal JSP to write java code --> 
<!--  <h2> Result is : <%= session.getAttribute("result") %> </h2>    -->


   <!-- Using JSTL --> 
<h2> Result is : ${result} </h2>

<h2> Welcome To ICS </h2>
<p> ${alien} </p>
<p> Welcome to the ${course} world</p>
<!-- <a href="views/index">Return To Calculator</a> -->

</body>

</html>