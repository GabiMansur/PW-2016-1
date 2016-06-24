<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Sucessfull!</title>
</head>
<body>
<%
    String validUName = "admin";
    String validPass = "admin";
    String username = request.getParameter("username");
    String password = request.getParameter("password");

//    out.println("test" +username+password);
    if ( username.equals(validUName) && password.equals(validPass)) {
        response.sendRedirect("productManager.jsp");
        out.println("Login Successfull");
    } else {
        response.sendRedirect("index.jsp");
    }
%>

</body>
</html>
