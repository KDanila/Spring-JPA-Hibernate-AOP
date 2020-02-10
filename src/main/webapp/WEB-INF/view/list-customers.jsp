<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>
    <title>List Customers</title>
</head>

<body>
<table>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <th>${customer.id}</th>
            <th>${customer.firstName}</th>
            <th>${customer.lastName}</th>
            <th>${customer.email}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>









