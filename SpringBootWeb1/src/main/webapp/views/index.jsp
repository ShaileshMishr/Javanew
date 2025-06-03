<%@page language="java" %>

<html>
<head>

<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>

<h2> ICS Calculator </h2>
<p> Welcome to Spring Boot Web Example Page </p>

<form action="add">
<label for="num1">Enter 1st Number :</label>
<input type="text" id="num1" name="num1"></input><br>
<label for="num2">Enter 2nd Number :</label>
<input type="text" id="num2" name="num2"></input><br>
<input type="submit" value="Submit">


</form>

<h2> Welcome To Alien Page </h2>
<form action="addAlien">
<label for="aid">Enter Id :</label>
<input type="text" id="aid" name="aid"></input><br>
<label for="aname">Enter Name :</label>
<input type="text" id="aname" name="aname"></input><br>
<input type="submit" value="Submit">


</form>


</body>

</html>