<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>The current count is <%= counter %>.</h1>
<form method="POST" action="/register">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your username" />
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your password" />
</form>

</body>
</html>