<%-- 
    Document   : eliminar
    Created on : 17/01/2019, 07:33:45 PM
    Author     : user
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
        String cod = request.getParameter("txtCod");
        Connection cnx = null;
        ResultSet rs = null;
        Statement sta = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/carritojsp?user=root&password=");

            sta = cnx.createStatement();
            sta.executeUpdate("delete from productos where id_producto='"+cod+"'");
            request.getRequestDispatcher("cart.jsp").forward(request, response);
            sta.close();
            rs.close();
            cnx.close();
        }catch(Exception e){out.print(e+"");}
        
        %>
        
    </body>
</html>
