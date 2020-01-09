<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title>Title</title>
    <%@ include file="partials/head.jsp"%>
    <%@ include file = "partials/navbar.jsp"%>
    <style>
        <%@include file="css/index.css"%>
    </style>
</head>
<body>
<p>Username: <%= request.getParameter("username") %></p>
<p>Password: <%= request.getParameter("password") %></p>
<%! String isAdmin = "admin"; %>
<c:if test="${isAdmin}"> <form method="POST" action="/profile.jsp"></form> </c:if>
<h1>The current count is <%= counter %>.</h1>
<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your username" /><br>
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your password" /><br>
    <input type="submit">
</form>

</body>
</html>