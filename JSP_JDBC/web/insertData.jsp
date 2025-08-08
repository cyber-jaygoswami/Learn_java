<%-- 
    Document   : insertData
    Created on : 4 Aug, 2025, 2:13:09 PM
    Author     : cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Insert Data :)</h1>
        <form>
            Enter Your Name : <input type="text" name="name"><br>
            Enter Your Stream : <input type="text" name="stream"><br>
            <input type="submit" name="Submit">
        </form>
        <%!
        String url = "jdbc:mysql://localhost:3307/java_demo";
        String username = "root";
        String password = "clear2cut";
        %>
        
        <%
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        
        }catch(Exception e){
            
        }
        
        Connection con = DriverManager.getConnection(url,username,password);
        
        String insertQuery = "INSERT INTO students(name,stream) VALUES(?,?)";
        PreparedStatement pr = con.prepareStatement(insertQuery);
        
        String name = request.getParameter("name");
        String stream = request.getParameter("stream");
        
        pr.setString(1, name);
        pr.setString(2,stream);
        pr.executeUpdate();
        
        
        
        
        %>
        
        
    </body>
</html>
