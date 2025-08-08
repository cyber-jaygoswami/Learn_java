<%-- 
    Document   : add
    Created on : 31 Jul, 2025, 1:14:51 PM
    Author     : cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <h1>Hello World!</h1>
        
        <%
        // ScriptLet block
         int a= Integer.parseInt(request.getParameter("num1"));
         int b= Integer.parseInt(request.getParameter("num2"));
         
         
         out.println(a/b);
        
        %>
       
    </body>
</html>
