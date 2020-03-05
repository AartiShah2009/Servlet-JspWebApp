<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<sql:setDataSource
	var="myDS"
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/EmployeeRegister"
	user="root" password="adm@123" 
	/>
	<sql:query var="listUsers" dataSource="${myDS}">
	SELECT * FROM reg;
	</sql:query>
	<div align="center">
	<table border="1" cellpadding="5" bgcolor="lightgreen">
	<caption><h2>List Of Users</h2></caption>
	<tr>
	<th>empId</th>
	<th>empName</th>
	<th>Address</th>
	</tr>
	<c:forEach var="li" items="${listUsers.rows}">
	<tr>
	<td><font color="red"><c:out value="${li.empId}"/></font></td>
	<td><font color="red"><c:out value="${li.empName}"/></font></td>
	<td><font color="red"><c:out value="${li.address}"/></font></td>
	</tr>
	</c:forEach>
	</table>	
	</div>

</body>
</html>