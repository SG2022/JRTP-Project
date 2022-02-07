<!DOCTYPE html>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<h2 align="center"> List Employees </h2>
<%-- <form:form action="listEmployee.html" method="get"> --%>  
<%-- <form:form method="get">   --%>
<form:form name="myform" action="save.html" method="post"> 
<c:if test="${!empty employees}">
<table align="center" border="2">
<tr> 
<th>ID</th>
<th>UserName</th>
<th>Password</th>
<th>Name</th>
<th>Age</th>
<th>E-Mail</th>
<th>Gender</th>
<th>Address</th>
<th>Action</th>

</tr>

<c:forEach items="${employees}" var="employee">
<tr>
<td><c:out value="${employee.id}"></c:out></td>
<td><c:out value="${employee.username}"></c:out></td>
<td><c:out value="${employee.password}"></c:out></td>
<td><c:out value="${employee.name}"></c:out></td>
<td><c:out value="${employee.age}"></c:out></td>
<td><c:out value="${employee.email}"></c:out></td>
<td><c:out value="${employee.gender}"></c:out></td>
<td><c:out value="${employee.address}"></c:out></td>
<td><a href="edit.html?id=${employee.id}">EDIT</a> || <a href="delete.html?id=${employee.id}">DELETE</a></td>
</tr>
</c:forEach>
</table>
</c:if>
 </form:form> 


</body>
</html>

