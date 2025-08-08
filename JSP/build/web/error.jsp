<%-- 
    Document   : error
    Created on : 1 Aug, 2025, 2:18:49 PM
    Author     : cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage='true'  %>
        

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="red">
        <h1>Error!! </h1>
        <%

        out.println(exception.getMessage());
        %>
    </body>
</html>
