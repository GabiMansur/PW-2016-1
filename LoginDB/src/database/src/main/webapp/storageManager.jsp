<%--
  Created by IntelliJ IDEA.
  User: icaro
  Date: 6/16/2016
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StorageManager</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
<%@page import="java.sql.*" %>
<div>
    <h1>Storage manager</h1>
    <hr>
    <button class="btn btn-default" >Insert Products</button>
    <button class="btn btn-default">Edit Products</button>
    <button class="btn btn-default">Remove Products</button>
    <hr>
</div>

<table class="table table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Product</th>
        <th>Description</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
        <%
            String dbURL = "jdbc:derby:localhost:1527/demo";
            Connection connection = null;
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection(dbURL);
            if(con!= null){
                System.out.println("Connectec do Database" + con.getCatalog());
            }
            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("select * from PRODUCTS");

            while(resultset.next()){
        %>
    <tr>
        <td><%resultset.getString(1); %></td>
        <td><%resultset.getString(2); %></td>
        <td><%resultset.getString(3); %></td>
        <td><%resultset.getString(4); %></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
