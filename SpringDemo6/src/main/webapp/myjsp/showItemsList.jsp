<%--
  Created by IntelliJ IDEA.
  User: 郭小港
  Date: 2019/8/11
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--//导入标签--%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>ShowItemsPageInformation</title>
</head>
<body>
        <table border="1" width="100%" align="center">
            <tr>
                <th>ItemsID</th>
                <th>ItemsName</th>
                <th>ItemsPrice</th>
                <%--<td>ItemsCreateTime</td>--%>
            </tr>

            <c:forEach items="${itmsListKey}" var="itemsVar">
                <tr>
                    <td>${itemsVar.itemsId}</td>
                    <td>${itemsVar.itemsName}</td>
                    <td>${itemsVar.itemsPrice}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
