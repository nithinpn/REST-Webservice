<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addItem">
id            : <input type="number"  name="id"><br>
price         : <input type="number"  name="price"><br>
description   : <input type="text"  name="description"><br>
brand         : <input type="text"  name="brand"><br>

<input type="submit" value="add">
</form>


<br>

<form action="getItem">
id            : <input type="number"  name="id"><br>
<input type="submit" value="get">
</form>

</body>
</html>