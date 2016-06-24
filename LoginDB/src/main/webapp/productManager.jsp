<%@ page import="classes.ProductManagerDao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Manager</title>
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css" type="text/css">
    <meta charset="utf-8"/>
</head>
<body>
<header class="page-header"><h1 class="text-center title">STORE</h1></header>
<h1> Produc List</h1>
<sql:setDataSource var="snapshot" driver="org.apache.derby.jdbc.EmbeddedDriver"
                   url="jdbc:derby://localhost:1527/database"
                   user="admin"  password="admin"/>
<sql:query dataSource="${snapshot}" var="result">
    SELECT * from PRODUTOS;
</sql:query>

<%
    final String URL = "jdbc:derby:database;create=true";
    Connection conn = DriverManager.getConnection(URL);
    if (conn != null) {

    } else {
        out.println("Database connection failed!");
    }
%>
</body>
</html>
