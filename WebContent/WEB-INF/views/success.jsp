<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>

	<h1>Success</h1>

	<h2>

		<c:out value="${sessionScope.USER}" />



	</h2>
	
	
	 <a href="hello.html"> say hello</a>
</h1>
<br>

<a href=" department.html"> Department</a>

<a href="listdept.html"> show all</a>

<a href="getdept.html"> get dept</a>
 
</br>
</br>


<h1>

BOOK MANAGEMENT SYSTEM
</h1>


<a href="book.html"> Create</a>
<a href="listbook.html">LIST BOOK</a>




<h1> LOGIN </h1>

<a href="login.html">Login</a>
	
</body>
</html>