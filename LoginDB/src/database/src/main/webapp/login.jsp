<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String dbURL = "jdbc:derby:localhost:1527/demo";
    String username = request.getParameter("username");
    String pw = request.getParameter("password");
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    Connection con = DriverManager.getConnection(dbURL, username, pw);
    if(con!= null){
        System.out.println("Connectec do Database" + con.getCatalog());
    }
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("SELECT * FROM MEMBERS WHERE USERNAME='" + username + "'AND PASSWORD='"+ pw + "'");
    if(rs.next()){
        session.setAttribute("usename", username);
        out.println("Login de: " + username + " realizado com sucesso");
        response.sendRedirect("storageManager.jsp");
    }else{
        response.sendRedirect("index.jsp");
    }
%>
