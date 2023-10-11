<%--
  Created by IntelliJ IDEA.
  User: tang
  Date: 2023/10/11
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
pageContext:<%=pageContext.getAttribute("name")%>
session:<%=session.getAttribute("name")%>
request:<%=request.getAttribute("name")%>
application:<%=application.getAttribute("name")%>
</body>

</html>
