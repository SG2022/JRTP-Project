<!DOCTYPE html>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<title>EDIT EMPLOYEE</title>
</head>
<body>

<%-- <form:form name="myform" action="save.html" method="post"> --%>
<form:form name="myform" action="/save.html" method="post">
<table align="center" border="2">   

<tr>
<td><form:label path="id">ID</form:label></td>
<td><form:input path="id" value="${employee.id}"/></td>
</tr>

<tr>
<td><form:label path="username">UserName</form:label></td>
<td><form:input path="username" value="${employee.username}"/></td>
</tr>

<tr>
<td><form:label path="password">Password</form:label></td>
<td><form:input path="password" value="${employee.password}"/></td>
</tr>

<tr>
<td><form:label path="name">Name</form:label></td>
<td><form:input path="name" value="${employee.name}"/></td>
</tr>

<tr>
<td><form:label path="age">Age</form:label></td>
<td><form:input path="age" value="${employee.age}"/></td>
</tr>

<tr>
<td><form:label path="gender">Gender</form:label></td>
<td><form:radiobutton path="gender" id="male" value="M" style="float:left;" required="required" checked="checked"/>Male</td>
<td><form:radiobutton path="gender" id="female" value="F" style="float:left;" required="required" checked="checked"/>Female</td>
</tr>

<tr>
<td><form:label path="email">Email</form:label></td>
<td><form:input path="email" value="${employee.email}"/></td>
<td><div colspan="1">${message}</div></td>
</tr>

<tr>
<td><form:label path="address">Address</form:label></td>
<td><form:input path="address" value="${employee.address}"/></td>
</tr>

<tr>
<td><input type="submit" value="submit"></td>
</tr>
 
</table>

<c:if test="${!empty employees}">
<table align="center" border="2">
<tr> 
<th>ID</th>
<th>UserName</th>
<th>Password</th>
<th>Name</th>
<th>Age</th>
<th>Gender</th>
<th>Email</th>
<th>Address</th>
</tr>

<c:forEach items="${employees}" var="employee">
<tr>
<td><c:out value="${employee.id}"></c:out></td>
<td><c:out value="${employee.username}"></c:out></td>
<td><c:out value="${employee.password}"></c:out></td>
<td><c:out value="${employee.name}"></c:out></td>
<td><c:out value="${employee.age}"></c:out></td>
<td><c:out value="${employee.gender}"></c:out></td>
<td><c:out value="${employee.email}"></c:out></td>
<td><c:out value="${employee.address}"></c:out></td>
<td><a href="edit.html?id=${employee.id}">EDITTTTTTTT</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</form:form>
</body>
</html>