<%--
  Created by IntelliJ IDEA.
  User: xuant
  Date: 3/1/2021
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<table>

<tr>
    <td>ID</td>
    <td>Name</td>
    <td>Email</td>
    <td>Address</td>
</tr>
<c:forEach items="${customerList}" var="customer">

    <tr>
        <td>${customer.getId()}</td>
        <td><a href="/update/${customer.getId()}"> ${customer.getName()}</a></td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td></tr>

</c:forEach>
</table>


</body>
</html>
