<%--
  Created by IntelliJ IDEA.
  User: xuant
  Date: 3/1/2021
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Information</title>
</head>
<body>
<form method="post" >
    <fieldset>
        <legend>Customer Information</legend>

        <table>
            <tr>
                <td><input name="id" value=" ${customer.getId()}" ></td>
            </tr>
            <tr>
                <td>
                    <input name="name" value="${customer.getName()  }">
                </td>
            </tr>
            <tr>
                <td>
                    <input name="email" value="${customer.getEmail()}">
                </td>
            </tr>
            <tr>
                <td>
                    <input name="address" value="${customer.getAddress()}">
                </td>
            </tr>
        </table>

        <button type="submit">Update</button>
    </fieldset>
</form>
</body>
</html>
