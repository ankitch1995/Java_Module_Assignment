<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProduct" method="post">
		Enter product name : <input type="text" name="name"> <br><br>
		Enter product price : <input type="number" name="price"> <br><br>
		<input type="submit">
	</form>
</body>
</html>