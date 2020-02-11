<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>List Customers</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>
<div id="container">
    <div id="content">
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
    </div>
</div>
</body>
</html>









