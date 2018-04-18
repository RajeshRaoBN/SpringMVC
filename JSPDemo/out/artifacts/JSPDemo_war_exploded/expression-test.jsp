<%--
  Created by IntelliJ IDEA.
  User: rajeshnarayanarao
  Date: 17/4/18
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
converting a string to upper case <%= new String("Hello World").toUpperCase()%>
<br/>
<br/>
25 multiplied by 2 = <%= 25 * 2 %>
<br/>
<br/>
75 less then 69 ? = <%= 75 < 69 %>
<br><br>
<% for (int i = 0; i < 5; i++) {
    out.print("My name is JSP " + i + "<br/>");
} %>
</body>
</html>
