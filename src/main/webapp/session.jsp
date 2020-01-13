<%@ page contentType="test/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE>
<html>
    <head>
        <title>Document</title>
    </head>
    <body>
        <h1>this is the Session jsp</h1>

        <h2><c:out value="${reqAt}"/> </h2>
        <h2><c:out value="${sessionScope.sesAt}"/> </h2>
        <h2><c:out value="${applicationScope.conAt}"/> </h2>


        <h2>This is how to get a session data <c:out value="${sessionScope.theName}"/> </h2>
        <h2>You have <c:out value="${sessionScope.cart.numItems}"/> items in your cart</h2>
        <p><%= request.getSession().getMaxInactiveInterval()%></p>

    </body>
</html>
