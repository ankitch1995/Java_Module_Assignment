<%@page import="com.cybage.model.Product"%>
<%@page import="java.util.List"%>
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

    <table border="1px">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
    </thead>
    <c:forEach var="item" items="${productList}">
    <tbody>
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
        </tr>
    </tbody>
	</c:forEach>
	</table>
	<br>
	<br>
	
	<a href="addProduct.jsp"><input type="button" value="Add Prooduct"></a><br><br>
	<a href="deleteProduct.jsp"><input type="button" value="Delete Product"></a><br><br>
	<a href="searchProduct.jsp"><input type="button" value="Search Product"></a><br><br>
	<a href="UpdateProduct"><input type="button" value="Update Product"></a>
	
</body>
</html>