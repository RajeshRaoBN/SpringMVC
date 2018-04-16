<%--
  Created by IntelliJ IDEA.
  User: rajeshnarayanarao
  Date: 4/4/18
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expressions</title>
</head>
<body>
    <%! public int x = 5; %>
    <br>
    <% out.print("Hello World!");%>
    <br>
    <%= "Hello Rajesh" %>
    <br>
    <%= new String("Donkey")%>
    <br>
    <%= new java.util.Date()%>
    <br>
    <%= x * 10 %>
    <br>
    Is 25 greater than 50 <%= 25 > 50 %>
</body>
</html>
