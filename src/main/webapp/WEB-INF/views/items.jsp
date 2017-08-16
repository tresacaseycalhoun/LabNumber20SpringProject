<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>GC Coffee</title>
    <link rel="stylesheet" href="/resources/items.css">
</head>
<body>
<h1>Welcome to GC Coffee</h1>
<img src="nitrocoldbrew.jpg" alt="Decaf Pike Place">
<table border="1">
    <tr>
        <th>Product Name</th>
        <th>Description</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${cList}" var="item">
        <tr>
            <td>
                    ${item.name}
            </td>
            <td>
                    ${item.description}
            </td>
            <td>
                    ${item.quantity}
            </td>
            <td>
                    ${item.price}
            </td>

        </tr>

    </c:forEach>

</table>
</body>
</html>
