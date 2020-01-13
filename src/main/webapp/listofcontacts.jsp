<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<div class="container">
    <c:forEach var="contacts" items="${contacts}">
        <h2>${contacts.firstName} ${contacts.lastName}</h2>
        <p>${contacts.phoneNumber}</p>

    </c:forEach>
</div>

</body>
</html>