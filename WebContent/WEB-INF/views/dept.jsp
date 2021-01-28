<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@page import="com.cruds.entity.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>

Department
</h1> 

 <!--  <form action="department.html" method="post">
 <label> Dept id:</label>
 <input type="text" name="deptid"/> </br>
 <label> Dept name:</label>
 <input type="text" name="deptname"/>
 <input  type="submit" value="Create"/>
 </form> -->
 
 
 <form:form>
 <form:input path="id"/>
 <form:input path="name"/>
<input type="submit" value="Create"/>
 </form:form>
 
 <h1>LIST OF DEPARTMENT</h1>

	<table border="1">

	<thead>
		<tr>
			<td>DEPT ID</td>
			<td>DEPT NAME</td>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="d" items="${DEPT_LIST }">
	<tr>
	<td> ${d.id} </td>
	<td> ${d.name}</td>
	<td> <a href="<c:url value='deldept-${d.id}' />">Delete</a></td>
	</tr>
	
	
	</c:forEach>

	</tbody>
	</table>
 
 
</body>
</html>