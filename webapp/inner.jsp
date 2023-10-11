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
<%
  pageContext.setAttribute("name","pageContext");
  session.setAttribute("name","session");
  request.setAttribute("name","request");
  application.setAttribute("name","application");
%>
</body>
<jsp:forward page="inner2.jsp"/>
</html>
